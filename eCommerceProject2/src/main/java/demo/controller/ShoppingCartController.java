package demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import demo.dao.order.OrderDao;
import demo.model.Customer;
import demo.model.Order;

@RestController
public class ShoppingCartController {
	
	private OrderDao orderDao;
	
	@Autowired
	public ShoppingCartController(OrderDao orderDao) {
		this.orderDao = orderDao;
	}
	
	@GetMapping("/shoppingcart")
	public Order sendShoppingCart(HttpSession session) {
		Customer currentUser = (Customer) session.getAttribute("currentUser");
		List<Order> OrderList =orderDao.findByMyCustomerAndOrderStatus(currentUser, "shoppingCart");
		
		return OrderList.get(0);
	}
	
	@GetMapping("/previousorders")
	public List<Order> sendPreviousOrders(HttpSession session) {
		Customer currentUser = (Customer) session.getAttribute("currentUser");
		List<Order> OrderList =orderDao.findByMyCustomerAndOrderStatus(currentUser, "previousOrder");
		
		return OrderList;
	}
	
	@PostMapping("/Order")
	public Order UpdateOrder(@RequestBody Order order ) {
		return orderDao.save(order);
	}
	
	
}
