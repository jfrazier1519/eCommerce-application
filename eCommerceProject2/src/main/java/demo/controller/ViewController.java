package demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class ViewController {

	/**
	 * redirects to the home page
	 * @return
	 */
	@GetMapping(value = "/callHomePage")
	public String callHomePage() {
		return "redirect: /eCommerceProject2/home.html";
	}

	/**
	 * redirects to the login page
	 * @return
	 */
	@GetMapping(value = "/callLoginPage")
	public String callProfilePage() {
		return "redirect: /eCommerceProject2/login.html";
	}
}
