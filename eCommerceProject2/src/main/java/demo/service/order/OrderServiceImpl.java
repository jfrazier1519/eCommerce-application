package demo.service.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.dao.order.OrderDao;
import demo.model.Customer;
import demo.model.Order;
import demo.model.Product;

@Service
public class OrderServiceImpl implements OrderService{
	
	private OrderDao orderDao;
	
	@Autowired
	public OrderServiceImpl(OrderDao orderDao) {
		this.orderDao = orderDao;
	}

	@Override
	public List<Order> selectPreviousOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order selectshoppingcart(Customer customer, String status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order insertOrder(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean UpdateQuantity(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean UpdatePrice(Product product) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	

}
