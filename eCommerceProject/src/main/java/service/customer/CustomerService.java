package service.customer;

import model.Customer;

public interface CustomerService {

	
	public Customer getCustomerInfo(int customerId);
	
	public boolean updateProfilePage(Customer customer);
}
