package dao.product;

import java.util.List;

import model.Product;

public interface ProductDao {
	
	public List<Product> selectAllProducts();
	
	public List<Product> selectProductByCategory(String catName);
}
