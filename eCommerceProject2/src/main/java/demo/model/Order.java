package demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Order {

	int order_id;
	int customer_id;
	int payment_id;
	int order_date;
	int product_id;
	int price;
	int quantity;
	int total;

}