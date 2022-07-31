package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Category;

public class TestDatabaseDao{

	public static void main(String[] args) {
		
		TestDatabaseDao category = new TestDatabaseDao();
		System.out.println(category.selectAllCategories());
	}
	
	
	public List<Category> selectAllCategories() {

		List<Category> categories = new ArrayList<>();

		try (Connection conn = ConnectionFactory.getConnection()) {

			String ourSQLStatement = "SELECT * FROM category";

			PreparedStatement ps = conn.prepareStatement(ourSQLStatement);

			ResultSet resultSet = ps.executeQuery(); // NOTE...this is NOT "executeUpdate" it's "executeQuery"

			while (resultSet.next()) {
				// resultSet.getInt(columnIndex)
				Category newCategory = new Category(resultSet.getInt(1), resultSet.getString(2));

				categories.add(newCategory);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return categories;
	}
		
}
