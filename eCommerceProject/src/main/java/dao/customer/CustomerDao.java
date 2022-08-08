package dao.customer;

import model.Customer;

public interface CustomerDao {

//		Josh - I'm going to put the methods to alter the profile page here. You'll probably need to put the new account method here as well Dawn.
	
	
	public Customer getCustomerById(int customerId);
	
	public boolean updateProfilePage(Customer customer);
}
