package demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ShoppingCart {

	private int cart_id;
	private int customer_id;
	private int product_id;
	private int price;
	private int quantity;
	private int total;

}