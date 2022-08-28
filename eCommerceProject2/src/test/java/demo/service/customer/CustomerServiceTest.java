package demo.service.customer;

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

		/*
		 * I am trying to pass over business logic from dao to controller.
		 * Test that it is passed correctly from one layer to another.
		 * 
		 */

		// Arrange
		Customer initialCust = new Customer();
		Customer expectedCust = new Customer();
		
		
		// Act
		
		
		
		// Assert
		
		
		
	}

	@Test
	void findCustomerByIdTest() {

		/*
		 * I am trying to pass over business logic from dao to controller.
		 * Test that it is passed correctly from one layer to another.
		 *
		 *	Then. Make sure the sensitive values are null like they're 
		 *	supposed to be when passed.
		 */

		// Arrange

		// Act

		// Assert

	}

	@Test
	void updateProfilePageTest() {

		/*
		 * I am trying to pass over business logic from dao to controller.
		 * Test that it is passed correctly from one layer to another.
		 *
		 *	Then. Make sure the object doesn't have any null values before 
		 *	being passed over. 
		 */

		// Arrange

		// Act

		// Assert

	}

}
