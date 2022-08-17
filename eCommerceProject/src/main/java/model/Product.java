package model;

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
		
//		public Product() {
//			// TODO Auto-generated constructor stub
//		}

//		public Product(int product_id, String product_name, int category_id, int quantity, int price,
//				String product_desc, String product_review) {
//			super();
//			this.product_id = product_id;
//			this.product_name = product_name;
//			this.category_id = category_id;
//			this.quantity = quantity;
//			this.price = price;
//			this.product_desc = product_desc;
//			this.product_review = product_review;
//		}
		
		public Product(String product_name, int quantity, int price,
				String product_desc, String product_review) {
			super();
			this.product_name = product_name;
			this.quantity = quantity;
			this.price = price;
			this.product_desc = product_desc;
			this.product_review = product_review;
		}
}
		

//		public int getProduct_id() {
//			return product_id;
//		}
//
//		public void setProduct_id(int product_id) {
//			this.product_id = product_id;
//		}
//
//		public String getProduct_name() {
//			return product_name;
//		}
//
//		public void setProduct_name(String product_name) {
//			this.product_name = product_name;
//		}
//
//		public int getCategory_id() {
//			return category_id;
//		}
//
//		public void setCategory_id(int category_id) {
//			this.category_id = category_id;
//		}
//
//		public int getQuantity() {
//			return quantity;
//		}
//
//		public void setQuantity(int quantity) {
//			this.quantity = quantity;
//		}
//
//		public int getPrice() {
//			return price;
//		}
//
//		public void setPrice(int price) {
//			this.price = price;
//		}
//
//		public String getProduct_desc() {
//			return product_desc;
//		}
//
//		public void setProduct_desc(String product_desc) {
//			this.product_desc = product_desc;
//		}
//
//		public String getProduct_review() {
//			return product_review;
//		}
//
//		public void setProduct_review(String product_review) {
//			this.product_review = product_review;
//		}
//
//		@Override
//		public String toString() {
//			return "\nProduct [product_name=" + product_name + ", quantity=" + quantity + ", price=" + price + ", product_desc=" + product_desc
//					+ ", product_review=" + product_review + "]";
//		}
//		
//		
//		
//}
