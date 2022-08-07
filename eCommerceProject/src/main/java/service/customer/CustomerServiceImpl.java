package service.customer;

import dao.customer.CustomerDao;
import dao.customer.CustomerDaoImpl;
import model.Customer;

public class CustomerServiceImpl implements CustomerService {

	CustomerDao myDao = new CustomerDaoImpl();
	
	/**
	 * This method retrieves all customer info necessary for profile page. 
	 * It will retrieve info by the customer id.
	 */
	@Override
	public Customer getCustomerInfo(int id) {
		return myDao.getCustomerById(id);
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
