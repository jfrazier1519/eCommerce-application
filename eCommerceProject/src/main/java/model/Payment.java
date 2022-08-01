package model;

public class Payment {

		int payment_id;
		String payment_type;
		String payment_status;
		int payment_date;
		String allowed;
		
		public Payment() {
			// TODO Auto-generated constructor stub
		}

		public Payment(int payment_id, String payment_type, String payment_status, int payment_date, String allowed) {
			super();
			this.payment_id = payment_id;
			this.payment_type = payment_type;
			this.payment_status = payment_status;
			this.payment_date = payment_date;
			this.allowed = allowed;
		}

		public int getPayment_id() {
			return payment_id;
		}

		public void setPayment_id(int payment_id) {
			this.payment_id = payment_id;
		}

		public String getPayment_type() {
			return payment_type;
		}

		public void setPayment_type(String payment_type) {
			this.payment_type = payment_type;
		}

		public String getPayment_status() {
			return payment_status;
		}

		public void setPayment_status(String payment_status) {
			this.payment_status = payment_status;
		}

		public int getPayment_date() {
			return payment_date;
		}

		public void setPayment_date(int payment_date) {
			this.payment_date = payment_date;
		}

		public String getAllowed() {
			return allowed;
		}

		public void setAllowed(String allowed) {
			this.allowed = allowed;
		}

		@Override
		public String toString() {
			return "\nPayment [payment_id=" + payment_id + ", payment_type=" + payment_type + ", payment_status="
					+ payment_status + ", payment_date=" + payment_date + ", allowed=" + allowed + "]";
		}
		
		
}
