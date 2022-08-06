package dao.account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dao.ConnectionFactory;
import model.Account;


public class AccountDaoImpl implements AccountDao {

	
	public static void main(String[] args) {
		
		AccountDao myDao = new AccountDaoImpl();
		System.out.println(myDao.selectByUser("username", "password"));
	}
	
	
	
	@Override
	public Account selectByUser(String user, String pass) {
		Account myAccount = new Account();
		int furnCount = 0;
		try (Connection conn = ConnectionFactory.getConnection()) {

			String ourSQLStatement = "SELECT customers.customer_id, accounts.username, accounts.password, customers.first_name, customers.last_name \r\n"
					+ "FROM accounts\r\n"
					+ "INNER JOIN customers\r\n"
					+ "ON accounts.account_id = customers.account_id\r\n"
					+ "WHERE accounts.username = ? AND accounts.password = ?;";

			PreparedStatement ps = conn.prepareStatement(ourSQLStatement);
			ps.setString(1, user);
			ps.setString(2,  pass);

			ResultSet resultSet = ps.executeQuery();

			if (resultSet.next()) {
				Account newAccount = new Account(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5));
//				
				myAccount = newAccount;
				
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return myAccount;
	}

}
