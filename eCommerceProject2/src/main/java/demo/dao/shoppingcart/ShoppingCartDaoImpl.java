package demo.dao.shoppingcart;

import java.util.List;

import org.springframework.stereotype.Repository;

import demo.model.ShoppingCart;

/*
 *  TODO this is a temporary dao implementation
 *  evertying here is subject to heavy modification if
 *  not complete deletion
 */
@Repository("shoppingCartName")
public class ShoppingCartDaoImpl implements ShoppingCartDao {

	@Override
	public List<ShoppingCart> selectAllItemsInShoppingCart() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertItemIntoShoppingCart(ShoppingCart shoppingCart) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteItemfromShoppingCart(int cartId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean clearCustomerShoppingCart(int CustomerId) {
		// TODO Auto-generated method stub
		return false;
	}

}
