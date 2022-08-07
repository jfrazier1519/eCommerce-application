package service.product;

import java.util.List;

import dao.product.ProductDao;
import dao.product.ProductDaoImpl;
import model.Product;

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
