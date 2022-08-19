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
	public Customer getCustomerInfo(int customerId) {
		return myDao.getReferenceById(customerId);
	}

	/*
	 * This method will be used to retrieve all necessary information for the profile page.
	 * Will not show card information in profile. Instead that should be viewed and altered at checkout.
	 */
	@Override
	public String updateProfilePage(Customer customer) {
		
		myDao.save(customer);
		
		return "success";
	}


}
