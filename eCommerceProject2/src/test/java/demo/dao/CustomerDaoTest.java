package demo.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import demo.dao.customer.CustomerDao;
import demo.model.Customer;

@DataJpaTest //does the autowiring for spring data, if it's a DAO
class CustomerDaoTest {

	
	private CustomerDao charDao;
	
	
	@Autowired
	public CustomerDaoTest(CustomerDao charDao) {
		super();
		this.charDao = charDao;
	}


	
	
	
	@Test
	void findByCustomerIdTest() {
	 
	 	//ARRANGE 
	 
		Customer initialCust = new Customer(1, "username", "password", "josh", "frazier", "123 wallaby way", "city", 12345, "usa", 24012, "myemail@gmail.com", "5000299000000000", "visa", "0721");
		charDao.save(initialCust);
		
		//ACT
		Customer actualCust = charDao.findByCustomerId(initialCust.getCustomerId());
		
		
		//ASSERT
		assertEquals(initialCust, actualCust);
 }
	
	@Test
	void findByUsernameAndPassword() {
	 
	 	//ARRANGE 
		String inputUser = "username";
		String inputPass = "password";
		Customer initialCust = new Customer(1, "username", "password", "josh", "frazier", "123 wallaby way", "city", 12345, "usa", 24012, "myemail@gmail.com", "5000299000000000", "visa", "0721");
		charDao.save(initialCust);
		
		//ACT
		Customer actualCust = charDao.findByUsernameAndPassword(inputUser, inputPass);
		
		
		//ASSERT
		assertEquals(initialCust, actualCust);
 }
 

}
