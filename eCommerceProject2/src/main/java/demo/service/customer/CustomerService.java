package demo.service.customer;

import demo.model.Customer;

public interface CustomerService {

	
	public Customer getCustomerInfo(int customerId);
	
	
	public Customer findByUsernameAndPassword(String username, String password);


	String updateProfilePage(Customer customer);

}
