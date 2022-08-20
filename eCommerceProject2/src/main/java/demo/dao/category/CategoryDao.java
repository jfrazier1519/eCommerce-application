package demo.dao.category;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.model.Category;

public interface CategoryDao extends JpaRepository<Category, Integer>{
	
	public Category findByCategoryName(String catName);
}
