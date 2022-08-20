package model;

public class Account {
	int accountId;
	int customerId;
	String username;
	String password;
	String first_name;
	String last_name;
	

	public Account() {
		
	}

	//	fields for making new account
	public Account(int accountId, int customerId, String username, String password) {
		super();
		this.accountId = accountId;
		this.customerId = customerId;
		this.username = username;
		this.password = password;
}

	public Account(int accountId, int customerId, String username, String password, String first_name, String last_name) {

		super();
		this.accountId = accountId;
		this.customerId = customerId;
		this.username = username;
		this.password = password;
		this.first_name = first_name;
		this.last_name = last_name;
	}
	
	public Account(int customerId, String username, String password, String first_name, String last_name) {
		super();
		this.customerId = customerId;
		this.username = username;
		this.password = password;
		this.first_name = first_name;
		this.last_name = last_name;
	}

	public int getAccountId() {
		return accountId;
	}


	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	@Override
	public String toString() {
		return "\nAccount [customerId=" + customerId + ", username=" + username + ", password=" + password
				+ ", first_name=" + first_name + ", last_name=" + last_name + "]";
	}
	
	
	
}
