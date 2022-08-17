package dao.account;

import model.Account;

public interface AccountDao {
         
		//can select a user by UserName & Password
		public Account selectByUser(String user, String pass);
		
		//can create a new account
		public boolean makeNewAccount(int accountId,String username, String password);
		
		
		
}
