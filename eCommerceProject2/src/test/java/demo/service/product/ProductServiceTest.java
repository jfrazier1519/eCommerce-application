package demo.service.product;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import demo.dao.product.ProductDao;
import demo.model.Category;
import demo.model.Product;
import demo.service.customer.CustomerServiceImpl;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
class ProductServiceTest {

	@Mock
	private ProductDao productDao;

	private ProductService productServ;

	@BeforeEach
	void setUp() throws Exception {
		productServ = new ProductServiceImpl(productDao);
	}

	@Test
	void findAllProductsTest() {

		// Arrange
		List<Product> initialList = new ArrayList<>();
		Category weapon = new Category(1, "weapons");
		initialList.add(new Product("MjölnirMk2", weapon, 3, 50000, "Mass produced hammer of mysterious origins",
				"very heavy"));
		initialList.add(new Product("MjölnirMk2", weapon, 3, 50000, "Mass produced hammer of mysterious origins",
				"very heavy"));
		initialList.add(new Product("MjölnirMk2", weapon, 3, 50000, "Mass produced hammer of mysterious origins",
				"very heavy"));

		List<Product> expectedList = new ArrayList<>();
		expectedList.addAll(initialList);

		when(productDao.findByOrderByProductId()).thenReturn(initialList);

		// Act

		List<Product> actualList = productServ.findAllProducts();

		// Assert
		verify(productDao, times(1)).findByOrderByProductId();

		assertEquals(expectedList, actualList);

	}

	@Test
	void findByCategoryTest() {

		// Arrange
		List<Product> initialList = new ArrayList<>();
		Category weapon = new Category(1, "weapons");
		initialList.add(new Product("MjölnirMk2", weapon, 3, 50000, "Mass produced hammer of mysterious origins",
				"very heavy"));
		initialList.add(new Product("MjölnirMk2", weapon, 3, 50000, "Mass produced hammer of mysterious origins",
				"very heavy"));
		initialList.add(new Product("MjölnirMk2", weapon, 3, 50000, "Mass produced hammer of mysterious origins",
				"very heavy"));

		List<Product> expectedList = new ArrayList<>();
		expectedList.addAll(initialList);

		when(productDao.findByCategory(weapon)).thenReturn(initialList);

		// Act

		List<Product> actualList = productServ.findByCategory(weapon);

		// Assert
		verify(productDao, times(1)).findByCategory(weapon);

		assertEquals(expectedList, actualList);

	}

	@Test
	void UpdateListOfProductsTest() {

		// Arrange
		List<Product> initialList = new ArrayList<>();
		Category weapon = new Category(1, "weapons");
		initialList.add(new Product("MjölnirMk2", weapon, 3, 50000, "Mass produced hammer of mysterious origins",
				"very heavy"));
		initialList.add(new Product("MjölnirMk2", weapon, 3, 50000, "Mass produced hammer of mysterious origins",
				"very heavy"));
		initialList.add(new Product("MjölnirMk2", weapon, 3, 50000, "Mass produced hammer of mysterious origins",
				"very heavy"));

		List<Product> expectedList = new ArrayList<>();
		expectedList.addAll(initialList);

		when(productDao.saveAll(initialList)).thenReturn(initialList);

		// Act

		List<Product> actualList = productServ.UpadateListOfProducts(initialList);

		// Assert
		verify(productDao, times(1)).saveAll(initialList);

		assertEquals(expectedList, actualList);

	}

	@Test
	void findByIdTest() {

		// Arrange
		Category weapon = new Category(1, "weapon");
		Product initialList = new Product("MjölnirMk2", weapon, 3, 50000, "Mass produced hammer of mysterious origins",
				"very heavy");
		Product expectedList = new Product("MjölnirMk2", weapon, 3, 50000, "Mass produced hammer of mysterious origins",
				"very heavy");

		when(productDao.findByProductId(1)).thenReturn(initialList);

		// Act

		Product actualList = productServ.findById(1);

		// Assert
		verify(productDao, times(1)).findByProductId(1);

		assertEquals(expectedList, actualList);

	}
}
