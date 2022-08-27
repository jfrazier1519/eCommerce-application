package demo.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RestController;

import demo.model.Customer;
import demo.model.Order;
import demo.model.Product;
import demo.service.customer.CustomerService;
import demo.service.order.OrderService;
import demo.service.product.ProductService;

@RestController
public class ShoppingCartController {
	
	private OrderService orderService;
	private CustomerService customerService;
	private ProductService productService;
	
	@Autowired
	public ShoppingCartController(OrderService orderService, CustomerService customerService, ProductService productService) {
		this.orderService = orderService;
		this.customerService = customerService;
		this.productService = productService;
	}
	
	@GetMapping("/shoppingcart")
	public Order sendShoppingCart(HttpSession session) {
		Customer currentUser = (Customer) session.getAttribute("currentUser");
		Customer myCustomer = customerService.findByCustomerId(currentUser.getCustomerId());
		List<Order> OrderList = orderService.selectPreviousOrders(myCustomer, "shoppingCart");
		
		return OrderList.get(0);
	}
	
	@GetMapping("/previousorders")
	public List<Order> sendPreviousOrders(HttpSession session) {
		Customer currentUser = (Customer) session.getAttribute("currentUser");
		Customer myCustomer = customerService.findByCustomerId(currentUser.getCustomerId());
		List<Order> OrderList = orderService.selectPreviousOrders(myCustomer, "previousOrder");
		
		return OrderList;
	}
	
	@PostMapping("/addtocart")
	public Boolean AddToCart(HttpServletRequest req, HttpSession session) {
		int inputId = Integer.parseInt(req.getParameter("id"));
		
		Product product = productService.findById(inputId);
		Customer currentUser = (Customer) session.getAttribute("currentUser");
		Customer myCustomer = customerService.findByCustomerId(currentUser.getCustomerId());
		myCustomer.setUsername(currentUser.getUsername());
		myCustomer.setPassword(currentUser.getPassword());
		List<Order> recall = orderService.selectPreviousOrders(myCustomer, "shoppingCart");
		if(recall.isEmpty()) {
			List<Product> temp = new ArrayList<>();
			temp.add(product);
			Date d = new Date(System.currentTimeMillis());
			Order newShoppingCart = new Order(d, 1, 1, "shoppingCart", myCustomer,temp );
			newShoppingCart.setTotal(newShoppingCart.getTotal() + product.getPrice());
			newShoppingCart.setQuantity(newShoppingCart.getQuantity() +1 );
			orderService.insertOrder(newShoppingCart);
			
		}else {
			Order newShoppingCart = recall.get(0);
			newShoppingCart.getMyProducts().add(product);
			newShoppingCart.setTotal(newShoppingCart.getTotal() + product.getPrice());
			newShoppingCart.setQuantity(newShoppingCart.getQuantity() +1 );
			orderService.insertOrder(newShoppingCart);
		}
		
		
		return true;
	}
	
	
}
