package demo.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.model.Account;
import demo.model.Product;
import demo.service.product.ProductService;
import demo.service.product.ProductServiceImpl;

@RestController
@RequestMapping("/products")
public class ProductController {

	
	public static void viewAllProducts(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		ProductService myServ = new ProductServiceImpl();
		HttpSession accountSession = req.getSession();
		Account currentAccount = (Account) accountSession.getAttribute("currentUser");

		PrintWriter printer = resp.getWriter();
		if (currentAccount != null) {
			List<Product> allProducts = myServ.selectAllProducts();

			printer.println(allProducts);
		} else {
			printer.println("No one is logged in");
		}
	}

	public static void viewProductByCategory(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		ProductService myServ = new ProductServiceImpl();
		HttpSession accountSession = req.getSession();
		Account currentAccount = (Account) accountSession.getAttribute("currentUser");

		String inputCategory = req.getParameter("Category");
		
		PrintWriter printer = resp.getWriter();
		if (currentAccount != null) {
			List<Product> allProducts = myServ.selectProductByCategory(inputCategory);

			printer.println(allProducts);
		} else {
			printer.println("No one is logged in");
		}
	}
}
