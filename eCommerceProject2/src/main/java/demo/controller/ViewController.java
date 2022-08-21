package demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class ViewController {

	/**
	 * redirects to the home page
	 * @return
	 */
	@GetMapping(value = "/callHomePage")
	public String callHomePage() {
		return "redirect: /eCommerceProject2/html/home.html";
	}
	
	/**
	 * redirects to the home page
	 * @return
	 */
	@GetMapping(value = "/callLoggedHomePage")
	public String callLoggedHomePage() {
		return "redirect: /eCommerceProject2/html/logged-home.html";
	}

	/**
	 * redirects to the login page
	 * @return
	 */
	@GetMapping(value ="/callLoginPage")
	public String callLoginPage() {
		System.out.println("AM I HERE?");
		return "/html/login.html";
	}
	
	/**
	 * redirects to the login page
	 * @return
	 */
	@GetMapping(value = "/callProfilePage")
	public String callProfilePage() {
		return "redirect: /eCommerceProject2/html/profile.html";
	}
	
	/**
	 * redirects to the login page
	 * @return
	 */
	@GetMapping(value = "/callProductsPage")
	public String callProductsPage() {
		return "redirect: /eCommerceProject2/html/products.html";
	}
	
	/**
	 * redirects to the login page
	 * @return
	 */
	@GetMapping(value = "/callOrdersPage")
	public String callOrdersPage() {
		return "redirect: /eCommerceProject2/html/orders.html";
	}
	
	/**
	 * redirects to the login page
	 * @return
	 */
	@GetMapping(value = "/callCartPage")
	public String callCartPage() {
		return "redirect: /eCommerceProject2/html/cart.html";
	}
	
	/**
	 * redirects to the login page
	 * @return
	 */
	@GetMapping(value = "/callRegisterPage")
	public String callRegisterPage() {
		return "redirect: /eCommerceProject2/html/new-account.html";
	}
}
