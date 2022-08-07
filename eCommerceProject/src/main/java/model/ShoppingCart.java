package model;

public class ShoppingCart {

	private int cart_id;
	private int customer_id;
	private int product_id;
	private int price;
	private int quantity;
	private int total;
	
	
	public ShoppingCart() {
		super();
	}


	public ShoppingCart(int cart_id, int customer_id, int product_id, int price, int quantity, int total) {
		super();
		this.cart_id = cart_id;
		this.customer_id = customer_id;
		this.product_id = product_id;
		this.price = price;
		this.quantity = quantity;
		this.total = total;
	}


	public int getCart_id() {
		return cart_id;
	}


	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}


	public int getCustomer_id() {
		return customer_id;
	}


	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}


	public int getProduct_id() {
		return product_id;
	}


	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public int getTotal() {
		return total;
	}


	public void setTotal(int total) {
		this.total = total;
	}


	@Override
	public String toString() {
		return "\nShoppingCart [cart_id=" + cart_id + ", customer_id=" + customer_id + ", product_id=" + product_id
				+ ", price=" + price + ", quantity=" + quantity + ", total=" + total + "]";
	}
	
	
}
