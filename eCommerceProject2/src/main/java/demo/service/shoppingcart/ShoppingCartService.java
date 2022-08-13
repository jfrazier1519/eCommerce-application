package demo.service.shoppingcart;

import java.util.List;

import demo.model.ShoppingCart;

public interface ShoppingCartService {
	
	public List<ShoppingCart> getAllItemsInShoppingCart();
	
	public boolean addItemIntoShoppingCart(ShoppingCart shoppingCart);
	
	public boolean deleteItemfromShoppingCart(int cartId);
	
	public boolean emptyCustomerShoppingCart(int CustomerId);
}
