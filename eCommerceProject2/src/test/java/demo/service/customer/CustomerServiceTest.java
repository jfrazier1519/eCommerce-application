package demo.service.customer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import demo.dao.customer.CustomerDao;
import demo.model.Customer;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
class CustomerServiceTest {

	@Mock
	private CustomerDao customerDao;

	private CustomerService customerServ;

	@BeforeEach
	void setUp() throws Exception {
		customerServ = new CustomerServiceImpl(customerDao);
	}

	@Test
	void findByUsernameAndPasswordTest() {

		// Arrange
		String username = "username";
		String password = "password";
		Customer intialCust = new Customer(1, "username", "password", "josh", "frazier", "123 wallaby way", "city", 12345, "usa", 24012, "myemail@gmail.com", "5000299000000000", "visa", "0721");
		Customer expectedCust = new Customer(1, "username", "password", "josh", "frazier", "123 wallaby way", "city", 12345, "usa", 24012, "myemail@gmail.com", "5000299000000000", "visa", "0721");
		when(customerDao.findByUsernameAndPassword(username, password)).thenReturn(intialCust);
		
			
		// Act
		
		Customer actualCust = customerServ.findByUsernameAndPassword(username, password);
		
		
		// Assert
		verify(customerDao, times(1)).findByUsernameAndPassword(username, password);
		
//		actualCust.setFirstName("Bob");
		
		assertEquals(expectedCust, actualCust);
		
		
	}

	@Test
	void findCustomerByIdTest() {

		// Arrange
		int custId = 1;
		Customer intialCust = new Customer(1, "username", "password", "josh", "frazier", "123 wallaby way", "city", 12345, "usa", 24012, "myemail@gmail.com", "5000299000000000", "visa", "0721");
		Customer expectedCust = new Customer(1, null, null, "josh", "frazier", "123 wallaby way", "city", 12345, "usa", 24012, "myemail@gmail.com", null, null, null);
		when(customerDao.findByCustomerId(custId)).thenReturn(intialCust);
		
			
		// Act
		
		Customer actualCust = customerServ.findByCustomerId(custId);
		
		
		// Assert
		verify(customerDao, times(1)).findByCustomerId(custId);
		
//		actualCust.setFirstName("Bob");
		
		assertEquals(expectedCust, actualCust);

	}

//	@Test
//	void updateProfilePageTest() {
//
//		// Arrange
//		Customer incomingCust = new Customer(1, null, null, "josh", "frazier", "123 wallaby way", "city", 12345, "usa", 24012, "myemail@gmail.com", null, null, null);
//		Customer expectedCust = new Customer(1, "username", "password", "josh", "frazier", "123 wallaby way", "city", 12345, "usa", 24012, "myemail@gmail.com", "5000299000000000", "visa", "0721");
//		when(customerDao.save(incomingCust)).thenReturn(incomingCust);
//		
//		// Act
//		
//		Customer actualCust = customerServ.updateProfilePage(incomingCust);
//		actualCust.setUsername("username");
//		actualCust.setPassword("password");
//		actualCust.setCreditCard("5000299000000000");
//		actualCust.setCreditCardType("visa");
//		actualCust.setCardExpiraryDate("0721");
//		
//		// Assert
//		verify(customerDao, times(1)).save(incomingCust);
//		
////		actualCust.setFirstName("Bob");
//		
//		assertEquals(expectedCust, actualCust);
//
//	}
	

}
