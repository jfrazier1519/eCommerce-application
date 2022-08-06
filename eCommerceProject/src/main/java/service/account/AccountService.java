package service.account;

import model.Account;

public interface AccountService {

	public Account findUser(String user, String pass);
}
