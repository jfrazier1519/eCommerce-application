package frontcontroller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.CustomerController;
import controller.LoginController;
import controller.ProductController;

public class Dispatcher {
	public static void myVirtualRouterMethod(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {

		switch (req.getRequestURI()) {
		case "/eCommerceProject/login":
			System.out.println("you are calling the login controller");
			LoginController.login(req, resp);
			break;
		case "/eCommerceProject/products/viewall":
			System.out.println("you are calling the products controller");
			ProductController.viewAllProducts(req, resp);
			break;
		case "/eCommerceProject/products/viewbycategory":
			System.out.println("you are calling the products controller");
			ProductController.viewProductByCategory(req, resp);
			break;
		case "/eCommerceProject/customer/viewprofilepage":
			System.out.println("you are calling the customer controller");
			CustomerController.viewProfilePage(req, resp);
			break;
		case "/eCommerceProject/customer/updateprofilepage":
			System.out.println("you are calling the customer controller");
			CustomerController.updateProfilePage(req, resp);
			break;
		default:
			System.out.println("Invalid Path. Try Again.");
			System.out.println(req.getRequestURI());
			break;
		}
	}
}
