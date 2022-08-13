package demo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import demo.model.Account;
import demo.model.Customer;
import demo.service.customer.CustomerService;
import demo.service.customer.CustomerServiceImpl;

@RestController
public class CustomerController {
	
	/**
	 * A method that checks to see if an account exists inside of the current session (logged in)
	 * If it does, retrieve the customer information and send to user.
	 * 	
	 * @param req
	 * @param resp
	 * @throws IOException
	 */
	@GetMapping(value="/viewprofilepage")
	public static void viewProfilePage(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		CustomerService myServ = new CustomerServiceImpl();
		HttpSession accountSession = req.getSession();
		Account currentAccount = (Account) accountSession.getAttribute("currentAccount");
		
		
		PrintWriter printer = resp.getWriter();
		if (currentAccount != null) {
			
			Customer myCustomer = myServ.getCustomerInfo(currentAccount.getCustomerId());

			printer.println(myCustomer);
		} else {
			printer.println("No one is logged in");
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
	public static void updateProfilePage(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		CustomerService myServ = new CustomerServiceImpl();
		HttpSession accountSession = req.getSession();
		Account currentAccount = (Account) accountSession.getAttribute("currentAccount");

		String inputCategory = req.getParameter("Category");
		
		PrintWriter printer = resp.getWriter();
		if (currentAccount != null) {
			
			resp.setContentType("application/json");
			ObjectMapper mapper = new ObjectMapper();
			Customer newProfile = mapper.readValue(req.getInputStream(), Customer.class);
			myServ.updateProfilePage(newProfile);
			
			printer.println("Profile Page Updated");
		} else {
			printer.println("No one is logged in");
		}
	}
	
	
}
