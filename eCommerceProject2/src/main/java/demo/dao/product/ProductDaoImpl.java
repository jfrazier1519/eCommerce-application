package demo.dao.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import demo.dao.ConnectionFactory;
import demo.model.Product;

public class ProductDaoImpl implements ProductDao {

//	public static void main(String[] args) {
//		
//		ProductDao myDao = new ProductDaoImpl();
//		
////		System.out.println(myDao.selectAllProducts());
//		System.out.println(myDao.selectProductByCategory("weapons"));
//	}
	
	
	@Override
	public List<Product> selectAllProducts() {
		List<Product> myProducts = new ArrayList<>();

		try (Connection conn = ConnectionFactory.getConnection()) {

			String ourSQLStatement = "SELECT products.product_name, products.quantity, products.price, products.product_desc, products.product_review\r\n"
					+ "FROM products \r\n"
					+ "INNER JOIN category\r\n"
					+ "ON products.category_id  = category.category_id;";

			PreparedStatement ps = conn.prepareStatement(ourSQLStatement);

			ResultSet resultSet = ps.executeQuery();

			while (resultSet.next()) {
				// resultSet.getInt(columnIndex)
				Product newProduct = new Product(resultSet.getString(1), resultSet.getInt(2), resultSet.getInt(3),  resultSet.getString(3),  resultSet.getString(3));

				myProducts.add(newProduct);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return myProducts;
	}

	@Override
	public List<Product> selectProductByCategory(String catName) {
		List<Product> myProducts = new ArrayList<>();

		try (Connection conn = ConnectionFactory.getConnection()) {

			String ourSQLStatement = "SELECT products.product_name, products.quantity, products.price, products.product_desc, products.product_review\r\n"
					+ "FROM products \r\n"
					+ "INNER JOIN category\r\n"
					+ "ON products.category_id  = category.category_id \r\n"
					+ "WHERE category_name = ?;";

			PreparedStatement ps = conn.prepareStatement(ourSQLStatement);
			ps.setString(1, catName);

			ResultSet resultSet = ps.executeQuery();

			while (resultSet.next()) {
				// resultSet.getInt(columnIndex)
				Product newProduct = new Product(resultSet.getString(1), resultSet.getInt(2), resultSet.getInt(3),  resultSet.getString(3),  resultSet.getString(3));

				myProducts.add(newProduct);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return myProducts;
	}

}
