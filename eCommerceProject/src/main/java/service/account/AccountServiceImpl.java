package service.account;

import dao.account.AccountDao;
import dao.account.AccountDaoImpl;
import model.Account;

public class AccountServiceImpl implements AccountService {

	AccountDao myDao = new AccountDaoImpl();
	
	@Override
	public Account findUser(String user, String pass) {
		return myDao.selectByUser(user, pass);
	}

}
