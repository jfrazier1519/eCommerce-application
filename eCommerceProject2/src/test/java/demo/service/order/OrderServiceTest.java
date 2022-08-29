package demo.service.order;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import demo.dao.order.OrderDao;
import demo.model.Category;
import demo.model.Customer;
import demo.model.Order;
import demo.model.Payment;
import demo.model.Product;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class OrderServiceTest {

	@Mock
	private OrderDao orderDao;

	private OrderService orderServ;

	@BeforeEach
	void setUp() throws Exception {
		orderServ = new OrderServiceImpl(orderDao);
	}

	@Test
	void selectPreviousOrdersTest() {

		// Arrange

		// Need a products list for order list
		List<Product> prodList = new ArrayList<>();
		Category weapon = new Category(1, "weapons");
		prodList.add(new Product("MjölnirMk2", weapon, 3, 50000, "Mass produced hammer of mysterious origins",
				"very heavy"));
		prodList.add(new Product("MjölnirMk2", weapon, 3, 50000, "Mass produced hammer of mysterious origins",
				"very heavy"));

		// Need customer for order list
		Customer myCust = new Customer(1, "username", "password", "josh", "frazier", "123 wallaby way", "city", 12345,
				"usa", 24012, "myemail@gmail.com", "5000299000000000", "visa", "0721");
		// Input Values
		String status = "purchased";
		Date myDate = Date.valueOf("2022-8-22");

		List<Order> initialList = new ArrayList<>();
		initialList.add(new Order(myDate, 2, 5, "previousOrder", myCust, prodList));
		List<Order> expectedList = new ArrayList<>();
		expectedList.addAll(initialList);

		when(orderDao.findByMyCustomerAndOrderStatus(myCust, status)).thenReturn(initialList);

		// Act

		List<Order> actualList = orderServ.selectPreviousOrders(myCust, status);

		// Assert
		verify(orderDao, times(1)).findByMyCustomerAndOrderStatus(myCust, status);

		assertEquals(expectedList, actualList);

	}

	@Test
	void insertOrderTest() {

		// Arrange

		// Need a products list for order list
		List<Product> prodList = new ArrayList<>();
		Category weapon = new Category(1, "weapons");
		prodList.add(new Product("MjölnirMk2", weapon, 3, 50000, "Mass produced hammer of mysterious origins",
				"very heavy"));
		prodList.add(new Product("MjölnirMk2", weapon, 3, 50000, "Mass produced hammer of mysterious origins",
				"very heavy"));

		// Need customer for order list
		Customer myCust = new Customer(1, "username", "password", "josh", "frazier", "123 wallaby way", "city", 12345,
				"usa", 24012, "myemail@gmail.com", "5000299000000000", "visa", "0721");
		// Input Values
		String status = "purchased";
		Date myDate = Date.valueOf("2022-8-22");
		
		Order initialOrder = new Order(myDate, 2, 5, "previousOrder", myCust, prodList);
		Order expectedOrder = new Order(myDate, 2, 5, "previousOrder", myCust, prodList);

		when(orderDao.save(initialOrder)).thenReturn(initialOrder);

		// Act

		Order actualOrder = orderServ.insertOrder(initialOrder);

		// Assert
		verify(orderDao, times(1)).save(initialOrder);

		assertEquals(expectedOrder, actualOrder);

	}

}
