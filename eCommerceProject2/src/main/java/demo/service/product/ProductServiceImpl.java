package demo.service.product;

import java.util.List;

import org.springframework.stereotype.Service;

import demo.dao.product.ProductDao;
import demo.dao.product.ProductDaoImpl;
import demo.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	ProductDao myDao = new ProductDaoImpl();
	
	@Override
	public List<Product> selectAllProducts() {
		return myDao.selectAllProducts();
	}

	@Override
	public List<Product> selectProductByCategory(String catName) {
		return myDao.selectProductByCategory(catName);
	}

}
