package demo.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import demo.model.Customer;
import demo.model.Order;
import demo.model.Product;
import demo.service.order.OrderService;

@RestController
public class ShoppingCartController {
	
	private OrderService orderService;
	
	@Autowired
	public ShoppingCartController(OrderService orderService) {
		this.orderService = orderService;
	}
	
	@GetMapping("/shoppingcart")
	public Order sendShoppingCart(HttpSession session) {
		Customer currentUser = (Customer) session.getAttribute("currentUser");
		List<Order> OrderList = orderService.selectPreviousOrders(currentUser, "shoppingCart");
		
		return OrderList.get(0);
	}
	
	@GetMapping("/previousorders")
	public List<Order> sendPreviousOrders(HttpSession session) {
		Customer currentUser = (Customer) session.getAttribute("currentUser");
		List<Order> OrderList = orderService.selectPreviousOrders(currentUser, "previousOrder");
		
		return OrderList;
	}
	
	@PostMapping("/addtocart")
	public Boolean AddToCart(@RequestBody Product Product, HttpSession session) {
		Customer currentUser = (Customer) session.getAttribute("currentUser");
		List<Order> recall = orderService.selectPreviousOrders(currentUser, "shoppingCart");
		if(recall.get(0) == null) {
			List<Product> temp = new ArrayList<>();
			temp.add(Product);
			Date d = new Date(System.currentTimeMillis());
			Order newShoppingCart = new Order(d, 1, 1, "pending", currentUser,temp );
			orderService.insertUpdateOrder(newShoppingCart);
			
		}else {
			recall.get(0).getMyProducts().add(Product);
			orderService.insertUpdateOrder(recall.get(0));
		}
		
		
		return true;
	}
	
	
}
