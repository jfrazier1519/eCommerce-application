package dao.account;

import model.Account;

public interface AccountDao {

		public Account selectByUser(String user, String pass);
}
