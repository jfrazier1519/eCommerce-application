package demo.service.account;

import demo.dao.account.AccountDao;
import demo.dao.account.AccountDaoImpl;
import demo.model.Account;

public class AccountServiceImpl implements AccountService {

	AccountDao myDao = new AccountDaoImpl();
	
	@Override
	public Account findUser(String user, String pass) {
		return myDao.selectByUser(user, pass);
	}

}
