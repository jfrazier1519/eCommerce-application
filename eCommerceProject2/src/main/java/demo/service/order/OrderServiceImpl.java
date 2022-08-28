package demo.service.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.dao.order.OrderDao;
import demo.model.Customer;
import demo.model.Order;


@Service
public class OrderServiceImpl implements OrderService{
	
	private OrderDao orderDao;
	
	@Autowired
	public OrderServiceImpl(OrderDao orderDao) {
		this.orderDao = orderDao;
	}

	@Override
	public List<Order> selectPreviousOrders(Customer customer, String status) {
		// TODO Auto-generated method stub
		return orderDao.findByMyCustomerAndOrderStatus(customer, status);
	}

	@Override
	public Order insertOrder(Order order) {
		// TODO Auto-generated method stub
		return orderDao.save(order);
	}

}
