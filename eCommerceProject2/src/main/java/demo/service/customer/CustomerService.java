package demo.service.customer;

import demo.model.Customer;

public interface CustomerService {

	
	public Customer getCustomerInfo(int customerId);
	
	public boolean updateProfilePage(Customer customer);
}
