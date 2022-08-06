package service.product;

import java.util.List;

import model.Product;

public interface ProductService {

	public List<Product> selectAllProducts();

	public List<Product> selectProductByCategory(String catName);
}
