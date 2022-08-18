package demo.dao.customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import demo.dao.ConnectionFactory;
import demo.model.Customer;

public class CustomerDaoImpl implements CustomerDao {

	public static void main(String[] args) {

		CustomerDao myDao = new CustomerDaoImpl();

//		System.out.println(myDao.getCustomerById(1));
//		myDao.updateProfilePage(new Customer(1, "Joshua", "Frazier", "123 Wallaby Way", "Sandy", 73452, "USA", 9034357463L, "mynewemail@email.com"));
	}

	/**
	 * This method will be used to retrieve all necessary information for the profile page.
	 * Will not show card information in profile. Instead that should be viewed and altered at checkout.
	 */
	@Override
	public Customer getCustomerById(int customerId) {
		Customer myCustomer = null;

		try (Connection conn = ConnectionFactory.getConnection()) {

			String ourSQLStatement = "SELECT customer_id, first_name, last_name, address, city, postal_code, country, tel_no, email\r\n"
					+ "FROM customers\r\n" + "WHERE customer_id = ?;";

			PreparedStatement ps = conn.prepareStatement(ourSQLStatement);
			ps.setInt(1, customerId);

			ResultSet resultSet = ps.executeQuery(); // NOTE...this is NOT "executeUpdate" it's "executeQuery"

			while (resultSet.next()) {
				// resultSet.getInt(columnIndex)
				Customer newCustomer = new Customer(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3),
						resultSet.getString(4), resultSet.getString(5), resultSet.getInt(6), resultSet.getString(7),
						resultSet.getLong(8), resultSet.getString(9));

				myCustomer = newCustomer;

				return myCustomer;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return myCustomer;
	}

	/**
	 * Updates the information visible on the profile page. To keep from accessing DB too much, 
	 * a user should make all changes to the page and will only activate method when hitting submit 
	 * at bottom of page.
	 * 
	 */
	@Override
	public boolean updateProfilePage(Customer customer) {
		try (Connection conn = ConnectionFactory.getConnection()) {

			// CHANGE SQL STATEMENT TO UPDATE
			String ourSQLStatement = "UPDATE customers \r\n"
					+ "SET customer_id = ?, first_name = ?, last_name = ?, address = ?, city = ?, postal_code = ?, country = ?, tel_no = ?, email = ?"
					+ "WHERE customer_id = ?;";

			PreparedStatement ps = conn.prepareStatement(ourSQLStatement);
			ps.setInt(1, customer.getId());
			ps.setString(2, customer.getFirst_name());
			ps.setString(3, customer.getLast_name());
			ps.setString(4, customer.getAddress());
			ps.setString(5, customer.getCity());
			ps.setInt(6, customer.getPostal_code());
			ps.setString(7, customer.getCountry());
			ps.setLong(8, customer.getTel_no());
			ps.setString(9, customer.getEmail());
			ps.setInt(10, customer.getId());
			

			ps.executeUpdate();

			return true;

		} catch (SQLException e) {
			e.printStackTrace();

			return false;
		}
	}

}
