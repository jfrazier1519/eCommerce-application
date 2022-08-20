package demo.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.model.Category;
import demo.model.Customer;
import demo.model.Product;
import demo.service.category.CategoryService;
import demo.service.product.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	
	private ProductService prodServ;
	private CategoryService catServ;
	
	@Autowired
	public ProductController(ProductService prodServ, CategoryService catServ) {
		this.prodServ=prodServ;
		this.catServ=catServ;
	}
	
	
	@PostMapping(value="/viewall")
	public List<Product> viewAllProducts(HttpSession session, HttpServletResponse resp) throws IOException {

		Customer currentUser = (Customer)session.getAttribute("currentUser");
		
		
		if (currentUser != null) {
			
			List<Product> allProducts = prodServ.findAllProducts();
			return allProducts;
			
		} else {
			PrintWriter printer = resp.getWriter();
			printer.println("No one is logged in");
			return null;
		}
	}

	@PostMapping(value="/viewbycategory")
	public List<Product> viewProductByCategory(HttpSession session, HttpServletRequest req, HttpServletResponse resp) throws IOException {

		Customer currentUser = (Customer)session.getAttribute("currentUser");

		String catName = req.getParameter("Category");
		Category queryCategory = catServ.findByCategoryName(catName);
		
		if (currentUser != null) {
			
			List<Product> allProducts = prodServ.findByCategory(queryCategory);
		 return allProducts;
			
		} else {
			PrintWriter printer = resp.getWriter();
			printer.println("No one is logged in");
			return null;
		}

	}
}
