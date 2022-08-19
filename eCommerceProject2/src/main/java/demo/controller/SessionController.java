package demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.model.Customer;
import demo.service.customer.CustomerService;


@RestController
public class SessionController {

	
	CustomerService myServ;
	
	@Autowired
	public SessionController(CustomerService myServ) {
		this.myServ = myServ;
	}
	
	
	@PostMapping(value = "/login")
	public String login(HttpSession session, HttpServletRequest req, Customer incomingUser) {

////////POSTMAN TEST
		String inputUsername = req.getParameter("username");
		String inputPassword = req.getParameter("password");
		
//		String inputUsername = incomingUser.getUsername();
//		String inputPassword = incomingUser.getPassword();

		if (myServ.findByUsernameAndPassword(inputUsername, inputPassword).getFirstName() != null) {

			Customer currentUser = myServ.findByUsernameAndPassword(inputUsername, inputPassword);

			session.setAttribute("currentUser", currentUser);

			return ("Welcome " + currentUser.getFirstName());


		} else {
			return ("Failed to login. User and Pass do not match. Try Again.");
		}

	}

	@PostMapping(value = "/getName")
	public String getLoggedInName(HttpSession session) {

		Customer currentUser = (Customer) session.getAttribute("currentUser");

		if (currentUser != null) {
			return currentUser.getFirstName();
		} else {
			return ("No one is logged in.");
		}
	}

	@GetMapping(value = "/logout")
	public String logout(HttpSession session) {

		Customer currentUser = (Customer) session.getAttribute("currentUser");

		if (currentUser != null) {
			session.invalidate();
			return ("You have logged out.");
		} else {
			return ("No one is logged in.");
		}
	}
}
