package demo.service.product;

import java.util.List;

import demo.model.Product;

public interface ProductService {

	public List<Product> selectAllProducts();

	public List<Product> selectProductByCategory(String catName);
}
