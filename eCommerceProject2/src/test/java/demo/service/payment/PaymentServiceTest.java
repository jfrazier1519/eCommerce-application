package demo.service.payment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import demo.dao.payment.PaymentDao;
import demo.dao.product.ProductDao;
import demo.model.Category;
import demo.model.Payment;
import demo.model.Product;
import demo.service.product.ProductService;
import demo.service.product.ProductServiceImpl;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class PaymentServiceTest {

	@Mock
	private PaymentDao payDao;

	private PaymentService payServ;

	@BeforeEach
	void setUp() throws Exception {
		payServ = new PaymentServiceImpl(payDao);
	}

	@Test
	void insertUpdatePaymentTest() {

		// Arrange
		Payment initialPay = new Payment(1, "visa", "5000299000000000", "0721");
		Payment expectedPay = new Payment(1, "visa", "5000299000000000", "0721");

		when(payDao.save(initialPay)).thenReturn(initialPay);

		// Act

		Payment actualPay = payServ.InsertUpdatePayment(initialPay);

		// Assert
		verify(payDao, times(1)).save(initialPay);

		assertEquals(expectedPay, actualPay);

	}

	@Test
	void selectAllPaymentsTest() {

		// Arrange
		List<Payment> initialList = new ArrayList<>();
		initialList.add(new Payment(1, "visa", "5000299000000000", "0721"));
		initialList.add(new Payment(2, "master", "5000299000000000", "0423"));
		
		List<Payment> expectedList = new ArrayList<>();
		expectedList.addAll(initialList);

		when(payDao.findAll()).thenReturn(initialList);

		// Act

		List<Payment> actualList = payServ.selectAllPayments();

		// Assert
		verify(payDao, times(1)).findAll();

		assertEquals(expectedList, actualList);

	}
}
