package demo.service.account;

import org.springframework.beans.factory.annotation.Autowired;

import demo.dao.account.AccountDao;
import demo.dao.account.AccountDaoImpl;
import demo.model.Account;

public class AccountServiceImpl implements AccountService {

	AccountDao myDao;
	
	//constructor
	@Autowired
	public AccountServiceImpl(AccountDao myDao) {
		this.myDao = myDao;
	}
	
	@Override
	public Account findUser(String user, String pass) {
		return myDao.selectByUser(user, pass);
	}

	@Override
	public void createAccount(Account myAcc) {
		myDao.save(myAcc);
	}

}
