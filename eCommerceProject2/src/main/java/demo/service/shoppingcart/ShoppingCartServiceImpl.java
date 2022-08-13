package demo.service.shoppingcart;

import java.util.List;

import org.springframework.stereotype.Service;

import demo.dao.shoppingcart.ShoppingCartDao;
import demo.model.ShoppingCart;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Service("ShoppingCartServ")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ShoppingCartServiceImpl implements ShoppingCartService{
	
	private ShoppingCartDao SCDao;

	@Override
	public List<ShoppingCart> getAllItemsInShoppingCart() {
		// TODO Auto-generated method stub
		return SCDao.selectAllItemsInShoppingCart();
	}

	@Override
	public boolean addItemIntoShoppingCart(ShoppingCart shoppingCart) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteItemfromShoppingCart(int cartId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean emptyCustomerShoppingCart(int CustomerId) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
