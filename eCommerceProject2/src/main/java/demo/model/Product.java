package demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {

	int product_id;
	String product_name;
	int category_id;
	int quantity;
	int price;
	String product_desc;
	String product_review;

	public Product(String product_name, int quantity, int price, String product_desc, String product_review) {
		super();
		this.product_name = product_name;
		this.quantity = quantity;
		this.price = price;
		this.product_desc = product_desc;
		this.product_review = product_review;
	}
}
