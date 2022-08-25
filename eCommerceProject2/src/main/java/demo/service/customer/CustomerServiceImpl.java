
package demo.service.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.dao.customer.CustomerDao;

import demo.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	private CustomerDao myDao;
	
	
	@Autowired 
	public CustomerServiceImpl(CustomerDao myDao){
		this.myDao=myDao;
	}
	
	
	/**
	 * Implements business logic for information concerning database. Passes method 
	 * call from Dao to Controller.
	 */
	public Customer findByUsernameAndPassword(String username, String password) {
		return myDao.findByUsernameAndPassword(username, password);
	}
	
	/**
	 * Implements business logic for information concerning database. Passes method 
	 * call from Dao to Controller.
	 * Since this is retrieving info for the profile page (and we don't want
	 * sensitive info displayed there), set sensitive info to null before passing 
	 * to controller.
	 */
	@Override
	public Customer findByCustomerId(int customerId) {
		
		//remove card info here. I don't want to send it to profile page.
		Customer sentCustomer = myDao.findByCustomerId(customerId);
		
		sentCustomer.setPassword(null);
		sentCustomer.setUsername(null);
		sentCustomer.setCreditCard(null);
		sentCustomer.setCreditCardType(null);
		sentCustomer.setCardExpiraryDate(null);
		
		return sentCustomer;
	}

	/*
	 * Implements business logic for information concerning database. Passes method 
	 * call from Dao to Controller. Since this is sending a new/updated customer object 
	 * to database, retrieve and store the missing values (sensitive data we omitted) before storing
	 * in db.
	 */
	@Override
	public String updateProfilePage(Customer updatedCustomer) {
		Customer currentCustomer = myDao.findByCustomerId(updatedCustomer.getCustomerId());
		
		//retrieve username, password, credit_card, credit_card_type, and card_expirary_date
		
		String customerPassword = currentCustomer.getPassword();
		String customerUsername = currentCustomer.getUsername();
		String customerCreditCard = currentCustomer.getCreditCard();
		String customerCreditCardType = currentCustomer.getCreditCardType();
		String customerCardExpiraryDate = currentCustomer.getCardExpiraryDate();
		
		updatedCustomer.setPassword(customerPassword);
		updatedCustomer.setUsername(customerUsername);
		updatedCustomer.setCreditCard(customerCreditCard);
		updatedCustomer.setCreditCardType(customerCreditCardType);
		updatedCustomer.setCardExpiraryDate(customerCardExpiraryDate);
		
		
		myDao.save(updatedCustomer);
		
		return "success";
	}


	@Override
	public void createNewCustomer(Customer customer) {
		
		myDao.save(customer);
		
	}

	
	

}
