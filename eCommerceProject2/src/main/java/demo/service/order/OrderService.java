package demo.service.order;

import java.util.List;

import demo.model.Customer;
import demo.model.Order;

public interface OrderService {
	
	public List<Order> selectPreviousOrders(Customer customer, String status);
	public Order insertUpdateOrder(Order order);
}
