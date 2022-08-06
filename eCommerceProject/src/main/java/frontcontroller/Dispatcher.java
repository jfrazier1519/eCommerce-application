package frontcontroller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.LoginController;

public class Dispatcher {
	public static void myVirtualRouterMethod(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {

		switch (req.getRequestURI()) {
		case "/eCommerceProject/login":
			System.out.println("you are calling the login controller");
			LoginController.login(req, resp);
			break;
		default:
			System.out.println("Invalid Path. Try Again.");
			System.out.println(req.getRequestURI());
			break;
		}
	}
}
