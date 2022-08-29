package demo.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import demo.model.Customer;
import demo.service.customer.CustomerService;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
class CustomerControllerTest {

	CustomerController custControl;
	
	@Mock
	CustomerService custServ;

	@BeforeEach
	void setUp() throws Exception {
		custControl = new CustomerController(custServ);
	}
	
//	@Test
//	void viewProfilePageTest() throws IOException {
//
//		// Arrange
//		
//		HttpSession session = null;
//		
//		
//		Customer initialCust = new Customer(1, "username", "password", "josh", "frazier", "123 wallaby way", "city", 12345, "usa", 24012, "myemail@gmail.com", "5000299000000000", "visa", "0721");
//		session.setAttribute("setCust", initialCust);
//		
//		
//		Customer expectedCust = new Customer(1, "username", "password", "josh", "frazier", "123 wallaby way", "city", 12345, "usa", 24012, "myemail@gmail.com", "5000299000000000", "visa", "0721");
//		when(custServ.findByCustomerId(1)).thenReturn(initialCust);
//		
//			
//		// Act
//		
//		Customer actualCust = custControl.viewProfilePage(session, null);
//		
//		
//		// Assert
//		verify(custServ, times(1)).findByCustomerId(1);
//		
//		assertEquals(expectedCust, actualCust);
//		
//		
//	}
	
//	@Test
//	void updateProfilePageTest() throws IOException {
//
//		// Arrange
//		String username = "username";
//		String password = "password";
//		Customer initialCust = new Customer(1, "username", "password", "josh", "frazier", "123 wallaby way", "city", 12345, "usa", 24012, "myemail@gmail.com", "5000299000000000", "visa", "0721");
//		Customer expectedCust = new Customer(1, "username", "password", "josh", "frazier", "123 wallaby way", "city", 12345, "usa", 24012, "myemail@gmail.com", "5000299000000000", "visa", "0721");
//		when(custServ.updateProfilePage(initialCust)).thenReturn("Profile Page Updated");
//			
//		// Act
//		
//		Customer actualCust = custControl.viewProfilePage();
//		
//		
//		// Assert
//		verify(custServ, times(1)).findByCustomerId(1);
//		
//		assertEquals(expectedCust, actualCust);
//		
//		
//	}
	
//	@Test
//	void createNewCustomerTest() throws IOException {
//
//		// Arrange
//		String username = "username";
//		String password = "password";
//		Customer intialCust = new Customer(1, "username", "password", "josh", "frazier", "123 wallaby way", "city", 12345, "usa", 24012, "myemail@gmail.com", "5000299000000000", "visa", "0721");
//		Customer expectedCust = new Customer(1, "username", "password", "josh", "frazier", "123 wallaby way", "city", 12345, "usa", 24012, "myemail@gmail.com", "5000299000000000", "visa", "0721");
//		when(custServ.findByCustomerId(1)).thenReturn(intialCust);
//		
//			
//		// Act
//		
//		Customer actualCust = custControl.viewProfilePage(null, null);
//		
//		
//		// Assert
//		verify(custServ, times(1)).findByCustomerId(1);
//		
//		assertEquals(expectedCust, actualCust);
//		
//		
//	}
}
