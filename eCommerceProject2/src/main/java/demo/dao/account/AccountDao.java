package demo.dao.account;

import demo.model.Account;

public interface AccountDao {

		public Account selectByUser(String user, String pass);
}
