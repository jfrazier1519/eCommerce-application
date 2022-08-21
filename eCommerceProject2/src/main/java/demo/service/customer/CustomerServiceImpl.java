
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
	
	
	//Method needs to be used for login.
	public Customer findByUsernameAndPassword(String username, String password) {
		return myDao.findByUsernameAndPassword(username, password);
	}
	
	/**
	 * This method retrieves all customer info necessary for profile page. 
	 * It will retrieve info by the customer id.
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
	 * This method will be used to retrieve all necessary information for the profile page.
	 * Will not show card information in profile. Instead that should be viewed and altered at checkout.
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
		
		System.out.println("CHECKPOINT 2: " + updatedCustomer);
		
		myDao.save(updatedCustomer);
		
		return "success";
	}


	@Override
	public void createNewCustomer(Customer customer) {
		
		
		
		myDao.save(customer);
		
	}

	
	

}
