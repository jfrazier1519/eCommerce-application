package demo.service.account;

import demo.model.Account;

public interface AccountService {

	public Account findUser(String user, String pass);
}
