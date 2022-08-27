package demo.service.order;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import demo.dao.order.OrderDao;
import demo.model.Order;

public class OrderServiceTest {
	
	@Mock
	private OrderDao orderDao;
	
	private OrderService orderService;
	
	@BeforeEach
	void setup() {
		orderService = new OrderServiceImpl(orderDao);
	}
	
	@Test
	void insertOrderTest() {
		//Arrange
		Order test1 = new Order();
		Order test2 = new Order();
		Order test3 = new Order();
		Order test4 = null;
		
		//Act
		orderService.insertOrder(test1);
		orderService.insertOrder(test2);
		orderService.insertOrder(test3);
		orderService.insertOrder(test4);
		
		//Assert
		
		
	}
	
	@Test
	void selectPreviousOrdersTest() {
		
	}
	
	
}
