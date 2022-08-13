package demo.service.customer;

import demo.dao.customer.CustomerDao;
import demo.dao.customer.CustomerDaoImpl;
import demo.model.Customer;

public class CustomerServiceImpl implements CustomerService {

	CustomerDao myDao = new CustomerDaoImpl();
	
	/**
	 * This method retrieves all customer info necessary for profile page. 
	 * It will retrieve info by the customer id.
	 */
	@Override
	public Customer getCustomerInfo(int customerId) {
		return myDao.getCustomerById(customerId);
	}

	/*
	 * This method will be used to retrieve all necessary information for the profile page.
	 * Will not show card information in profile. Instead that should be viewed and altered at checkout.
	 */
	@Override
	public boolean updateProfilePage(Customer customer) {
		
		boolean boolResults = myDao.updateProfilePage(customer);
		return boolResults;
	}

}
