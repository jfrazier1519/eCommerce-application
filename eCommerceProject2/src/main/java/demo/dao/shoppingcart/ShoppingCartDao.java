package demo.dao.shoppingcart;

import java.util.List;

import demo.model.ShoppingCart;

/*
 *  TODO implement Spring data once added
 */
public interface ShoppingCartDao {
	
	public List<ShoppingCart> selectAllItemsInShoppingCart();
	
	public boolean insertItemIntoShoppingCart(ShoppingCart shoppingCart);
	
	public boolean deleteItemfromShoppingCart(int cartId);
	
	public boolean clearCustomerShoppingCart(int CustomerId);

}
