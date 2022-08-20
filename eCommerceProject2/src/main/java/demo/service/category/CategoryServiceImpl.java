package demo.service.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.dao.category.CategoryDao;
import demo.model.Category;

@Service
public class CategoryServiceImpl implements CategoryService {

	private CategoryDao myDao;
	
	@Autowired
	public CategoryServiceImpl(CategoryDao myDao) {
		super();
		this.myDao = myDao;
	}


	@Override
	public Category findByCategoryName(String catName) {
		return myDao.findByCategoryName(catName);
	}

		
}
