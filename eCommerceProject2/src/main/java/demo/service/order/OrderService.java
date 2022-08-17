package demo.service.order;

import java.util.List;

import demo.model.Customer;
import demo.model.Order;
import demo.model.Product;

public interface OrderService {
	
	public List<Order> selectPreviousOrders();
	public Order selectshoppingcart(Customer customer, String status);
	public Order insertOrder(Order order);
	public boolean UpdateQuantity(Product product);
	public boolean UpdatePrice(Product product);

}
