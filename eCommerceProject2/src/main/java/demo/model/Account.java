package demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Account {
	int accountId;
	int customerId;
	String username;
	String password;
	String first_name;
	String last_name;

	public Account(int customerId, String username, String password, String first_name, String last_name) {
		super();
		this.customerId = customerId;
		this.username = username;
		this.password = password;
		this.first_name = first_name;
		this.last_name = last_name;
	
	}

	public Account(String username, String password, String first_name, String last_name) {
		super();
		
		this.username = username;
		this.password = password;
		this.first_name = first_name;
		this.last_name = last_name;
	
	}

	
	
}
