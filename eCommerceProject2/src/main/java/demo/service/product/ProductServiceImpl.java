package demo.service.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.dao.product.ProductDao;
import demo.model.Category;
import demo.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	ProductDao myDao;
	
	@Autowired
	public ProductServiceImpl(ProductDao myDao) {
		this.myDao=myDao;
	}
	
	@Override
	public List<Product> findAllProducts() {
		return myDao.findAll();
	}

	@Override
	public List<Product> findByCategory(Category category) {
		return myDao.findByCategory(category);
	}

	@Override
	public List<Product> UpadateListOfProducts(List<Product> products) {
		return myDao.saveAll(products);
	}

}
