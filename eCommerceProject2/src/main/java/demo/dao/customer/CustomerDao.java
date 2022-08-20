package demo.dao.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import demo.model.Customer;

public interface CustomerDao extends JpaRepository<Customer, Integer>{

	public Customer findByCustomerId(int customerId);
	
	
	public Customer findByUsernameAndPassword(String username, String password);
	
	//create new account
	public void createNewCustomer(Customer customer);
}
