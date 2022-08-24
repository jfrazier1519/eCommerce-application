package demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import demo.model.Customer;
import demo.model.Order;
import demo.model.Payment;
import demo.model.Product;
import demo.service.order.OrderService;
import demo.service.payment.PaymentService;
import demo.service.product.ProductService;

@RestController
public class CheckoutController {
	private OrderService orderService;
	private PaymentService paymentService;
	private ProductService productService;
	
	@Autowired
	public CheckoutController(OrderService orderService, PaymentService paymentService,
			ProductService productService) {
		this.orderService = orderService;
		this.paymentService = paymentService;
		this.productService = productService;
	}
	
	
	@PostMapping("/checkout")
	public boolean checkout(HttpSession session) {
		Customer currentUser = (Customer) session.getAttribute("currentUser");
		List<Order> olist = orderService.selectPreviousOrders(currentUser, "shoppingCart");
		Order temp = olist.get(0);
		for(Product p : temp.getMyProducts()){
			if(p.getQuantity() == 0) {
				return false;
			}
			p.setQuantity(p.getQuantity()-1);
		}
		productService.UpadateListOfProducts(temp.getMyProducts());
		temp.setOrderStatus("previousOrder");
		orderService.insertUpdateOrder(temp);

		return true;
		
	}
	
	@PostMapping("/paymentverification")
	public boolean checkCard( HttpSession session) {
		Customer currentUser = (Customer) session.getAttribute("currentUser");
		List<Payment> allApprovedCards= paymentService.selectAllPayments();
		for(Payment p : allApprovedCards) {
			if(p.getPaymentNum().equals(currentUser.getCreditCard()) &&
					p.getPaymentType().equals(currentUser.getCreditCardType()) &&
					p.getPaymentExpiration().equals(currentUser.getCardExpiraryDate())) {
				return true;
			}
		}
		
		return false;
	}
	
	@PostMapping("/testaddpayment")
	public Payment addPayment(@RequestBody Payment payment) {
		return paymentService.InsertUpdatePayment(payment);
	}
	
}
