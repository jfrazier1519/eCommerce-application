package demo.service.product;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import demo.dao.product.ProductDao;
import demo.model.Product;

@ExtendWith(MockitoExtension.class)
@DataJpaTest
class ProductServiceTest {

	@Mock
	private ProductDao productDao;
	
	private ProductService productServ;

	@Autowired
	public ProductServiceTest(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

//	@Test
//	void findAllProductsTest() {
//
//		// Arrange
//		List<Product> initialList = new ArrayList<>();
//		initialList.add(new Product("MjölnirMk2", 3, 5000, "Mass produced hammer of mysterious origins", "very heavy"));
//		initialList.add(new Product("MjölnirMk2", 3, 5000, "Mass produced hammer of mysterious origins", "very heavy"));
//		initialList.add(new Product("MjölnirMk2", 3, 5000, "Mass produced hammer of mysterious origins", "very heavy"));
//		
//		List<Product> expectedList = new ArrayList<>();
//		expectedList.addAll(initialList);
//		
//		when(productDao.findByOrderByProductId()).thenReturn(initialList);
//
//		// Act
//
//		List<Product> actualList = productServ.findAllProducts();
//
//		// Assert
//		verify(productDao, times(1)).findByOrderByProductId();
//
//
//		assertEquals(expectedList, actualList);
//
//	}

//	@Test
//	void findByCategoryTest() {
//
//		/*
//		 * I am trying to pass over business logic from dao to controller. Test that it
//		 * is passed correctly from one layer to another.
//		 * 
//		 */
//
//		// Arrange
//
//		// Act
//
//		// Assert
//
//	}
//
//	@Test
//	void UpdateListOfProductsTest() {
//
//		/*
//		 * I am trying to pass over business logic from dao to controller. Test that it
//		 * is passed correctly from one layer to another.
//		 * 
//		 */
//
//		// Arrange
//
//		// Act
//
//		// Assert
//
//	}
//
//	@Test
//	void findByIdTest() {
//
//		/*
//		 * I am trying to pass over business logic from dao to controller. Test that it
//		 * is passed correctly from one layer to another.
//		 * 
//		 */
//
//		// Arrange
//
//		// Act
//
//		// Assert
//
//	}
}
