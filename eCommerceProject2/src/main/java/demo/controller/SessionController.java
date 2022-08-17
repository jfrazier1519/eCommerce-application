package demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import demo.model.Account;
import demo.service.account.AccountService;
import demo.service.account.AccountServiceImpl;

@RestController
public class SessionController {

	@GetMapping(value = "/login")
	public String login(HttpSession session, HttpServletResponse resp, HttpServletRequest req) {

		AccountService myServ = new AccountServiceImpl();
		
		String inputUsername = req.getParameter("username");
		String inputPassword = req.getParameter("password");
		
		
//		String inputUsername = userAccount.getUsername();
//		String inputPassword = userAccount.getPassword();

		if (myServ.findUser(inputUsername, inputPassword).getFirst_name() != null) {

			Account currentUser = myServ.findUser(inputUsername, inputPassword);

			session.setAttribute("currentUser", currentUser);

			return ("Welcome " + currentUser.getFirst_name());

			// I NEED TO REDIRECT TO MAIN PAGE ONCE LOGIN WORKS
//			resp.sendRedirect();

		} else {
			return ("Failed to login. User and Pass do not match. Try Again.");
		}

	}

	@GetMapping(value = "/getName")
	public String getLoggedInName(HttpSession session) {
		AccountService myServ = new AccountServiceImpl();

		Account currentUser = (Account) session.getAttribute("currentUser");

		if (currentUser != null) {
			return currentUser.getFirst_name();
		} else {
			return ("No one is logged in.");
		}
	}

	@GetMapping(value = "/logout")
	public String logout(HttpSession session) {

		Account currentUser = (Account) session.getAttribute("currentUser");

		if (currentUser != null) {
			session.invalidate();
			return ("You have logged out.");
		} else {
			return ("No one is logged in.");
		}
	}
}
