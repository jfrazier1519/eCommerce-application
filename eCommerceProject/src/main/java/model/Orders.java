package model;

public class Orders {

		int order_id;
		int customer_id;
		int payment_id;
		int order_date;
		int product_id;
		int price;
		int quantity;
		int total;
		
		public Orders() {
			// TODO Auto-generated constructor stub
		}

		public Orders(int order_id, int customer_id, int payment_id, int order_date, int product_id, int price,
				int quantity, int total) {
			super();
			this.order_id = order_id;
			this.customer_id = customer_id;
			this.payment_id = payment_id;
			this.order_date = order_date;
			this.product_id = product_id;
			this.price = price;
			this.quantity = quantity;
			this.total = total;
		}

		public int getOrder_id() {
			return order_id;
		}

		public void setOrder_id(int order_id) {
			this.order_id = order_id;
		}

		public int getCustomer_id() {
			return customer_id;
		}

		public void setCustomer_id(int customer_id) {
			this.customer_id = customer_id;
		}

		public int getPayment_id() {
			return payment_id;
		}

		public void setPayment_id(int payment_id) {
			this.payment_id = payment_id;
		}

		public int getOrder_date() {
			return order_date;
		}

		public void setOrder_date(int order_date) {
			this.order_date = order_date;
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
			return "\nOrders [order_id=" + order_id + ", customer_id=" + customer_id + ", payment_id=" + payment_id
					+ ", order_date=" + order_date + ", product_id=" + product_id + ", price=" + price + ", quantity="
					+ quantity + ", total=" + total + "]";
		}
		
		
}
