package demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import demo.dao.category.CategoryDao;
import demo.dao.payment.PaymentDao;
import demo.model.Category;
import demo.model.Payment;
import demo.service.category.CategoryService;
import demo.service.category.CategoryServiceImpl;
import demo.service.payment.PaymentService;
import demo.service.payment.PaymentServiceImpl;

@ExtendWith(MockitoExtension.class)
@DataJpaTest
public class CategoryServiceTest {

	
	@Mock
	private CategoryDao catDao;

	private CategoryService catServ;

	@BeforeEach
	void setUp() throws Exception {
		catServ = new CategoryServiceImpl(catDao);
	}

	@Test
	void insertUpdatePaymentTest() {

		// Arrange
		String category = "weapons";
		Category initialCat = new Category(1, "weapons");
		Category expectedCat = new Category(1, "weapons");
		
		when(catDao.findByCategoryName(category)).thenReturn(initialCat);

		// Act

		Category actualCat = catServ.findByCategoryName(category);

		// Assert
		verify(catDao, times(1)).findByCategoryName(category);

		assertEquals(expectedCat, actualCat);

	}
}
