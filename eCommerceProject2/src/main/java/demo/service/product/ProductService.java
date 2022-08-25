package demo.service.product;

import java.util.List;

import demo.model.Category;
import demo.model.Product;

public interface ProductService {

	public List<Product> findAllProducts();

	public List<Product> findByCategory(Category category);
	
	public Product findById(int id);
	
	public List<Product> UpadateListOfProducts(List<Product> products);
}
