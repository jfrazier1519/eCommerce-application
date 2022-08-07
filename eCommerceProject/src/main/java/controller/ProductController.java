package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Account;
import model.Product;
import service.product.ProductService;
import service.product.ProductServiceImpl;

public class ProductController {

	public static void viewAllProducts(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		ProductService myServ = new ProductServiceImpl();
		HttpSession accountSession = req.getSession();
		Account currentAccount = (Account) accountSession.getAttribute("currentAccount");

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
		Account currentAccount = (Account) accountSession.getAttribute("currentAccount");

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
