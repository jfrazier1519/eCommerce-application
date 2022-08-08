package dao.account;

import model.Account;

public interface AccountDao {
         
		//can select a user by UserName & Password
		public Account selectByUser(String user, String pass);
		
		//can create a new account
		public boolean makeNewAccount(String username, String password, String first_name, String last_name);
		
		
		
}
