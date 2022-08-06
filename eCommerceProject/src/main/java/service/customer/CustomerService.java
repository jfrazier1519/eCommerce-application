package service.customer;

import model.Customer;

public interface CustomerService {

	
	public Customer getCustomerInfo(int id);
	
	public boolean updateProfilePage(Customer customer);
}
