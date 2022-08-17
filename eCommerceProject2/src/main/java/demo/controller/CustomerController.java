package demo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.model.Account;
import demo.model.Customer;
import demo.service.customer.CustomerService;
import demo.service.customer.CustomerServiceImpl;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	/**
	 * A method that checks to see if an account exists inside of the current session (logged in)
	 * If it does, retrieve the customer information and send to user.
	 * 	
	 * @param req
	 * @param resp
	 * @throws IOException
	 */
	@PostMapping(value="/viewprofilepage")
	public Customer viewProfilePage(HttpSession session, HttpServletResponse resp) throws IOException {

		CustomerService myServ = new CustomerServiceImpl();
		
		Account currentUser = (Account)session.getAttribute("currentUser");
		
		
		if (currentUser!= null) {
			
			Customer myCustomer = myServ.getCustomerInfo(currentUser.getCustomerId());
			return(myCustomer);
		} else {
			PrintWriter printer = resp.getWriter();
			
			printer.println("No one is logged in");
			return null;
		}
	}
	
	/**
	 * A method that checks to see if an account exists inside of the current session (logged in)
	 * If it does, receive a JSON object from the user and send to DB.
	 * 
	 * @param req
	 * @param resp
	 * @throws IOException
	 */
	@PostMapping(value="/updateprofilepage")
	public String updateProfilePage(@RequestBody Customer newProfile, HttpSession session) throws IOException {

		CustomerService myServ = new CustomerServiceImpl();

		Account currentUser = (Account)session.getAttribute("currentUser");
		
		if (currentUser != null) {
			
			myServ.updateProfilePage(newProfile);
			
			return("Profile Page Updated");
		} else {
			return("No one is logged in");
		}
	}
	
	
}
