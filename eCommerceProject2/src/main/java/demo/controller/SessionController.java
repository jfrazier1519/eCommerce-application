package demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import demo.model.Customer;
import demo.service.customer.CustomerService;

@Controller
public class SessionController {

	CustomerService myServ;

	@Autowired
	public SessionController(CustomerService myServ) {
		this.myServ = myServ;
	}

	@PostMapping(value = "/login")
	public String login(HttpSession session, HttpServletRequest req /* @RequestBody Customer incomingUser */) {

		String inputUsername = req.getParameter("username");
		String inputPassword = req.getParameter("password");

		if (myServ.findByUsernameAndPassword(inputUsername, inputPassword).getFirstName() != null) {

			Customer currentUser = myServ.findByUsernameAndPassword(inputUsername, inputPassword);

			session.setAttribute("currentUser", currentUser);

			return "redirect:/html/logged-home.html";

		} else {
			return "redirect:/html/home.html";
		}

	}

	/**
	 * Method to retrieve the current user object in session and return it to client if exists.
	 * Otherwise return null object.
	 * 
	 * @param session
	 * @return currentUser if one currently exists. Otherwise return null
	 */
	@PostMapping(value = "/getCurrentUser")
	public Customer getCurrentUser(HttpSession session) {

		Customer currentUser = (Customer) session.getAttribute("currentUser");

		if(currentUser == null) {
			return new Customer(null, null, null, null);
		}
		return currentUser;
	}

	@GetMapping(value = "/logout")
	public void logout(HttpSession session) {

//		Customer currentUser = (Customer) session.getAttribute("currentUser");
		session.invalidate();

	}
}
