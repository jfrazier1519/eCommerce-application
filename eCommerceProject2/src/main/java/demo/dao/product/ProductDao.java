package demo.dao.product;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.model.Category;
import demo.model.Product;

public interface ProductDao extends JpaRepository<Product, Integer>{
	
	public List<Product> findByOrderByProductId();
	
	public List<Product> findByCategory(Category category);
	
	public Product findByProductId(int id);
}
