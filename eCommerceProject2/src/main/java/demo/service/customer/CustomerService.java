package demo.service.customer;


import demo.model.Customer;

public interface CustomerService {

	
	public Customer findByCustomerId(int customerId);
	
	
	public Customer findByUsernameAndPassword(String username, String password);


	public Customer updateProfilePage(Customer customer);
	
	//create new account
	public void createNewCustomer(Customer customer);

}
