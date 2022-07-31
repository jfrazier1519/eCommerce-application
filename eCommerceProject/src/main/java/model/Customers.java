package model;

public class Customers {
	
	int customer_id;
	String first_name;
	String last_name;
	String address;
	String city;
	int postal_code;
	String country;
	int tel_no;
	String email;
	String credit_card;
	String credit_card_type;
	String card_expirary_date; 
	
	
	
	public Customers() {
		// TODO Auto-generated constructor stub
	}



	public Customers(int customer_id, String first_name, String last_name, String address, String city, int postal_code,
			String country, int tel_no, String email, String credit_card, String credit_card_type,
			String card_expirary_date) {
		super();
		this.customer_id = customer_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.address = address;
		this.city = city;
		this.postal_code = postal_code;
		this.country = country;
		this.tel_no = tel_no;
		this.email = email;
		this.credit_card = credit_card;
		this.credit_card_type = credit_card_type;
		this.card_expirary_date = card_expirary_date;
	}



	public int getCustomer_id() {
		return customer_id;
	}



	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}



	public String getFirst_name() {
		return first_name;
	}



	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}



	public String getLast_name() {
		return last_name;
	}



	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public int getPostal_code() {
		return postal_code;
	}



	public void setPostal_code(int postal_code) {
		this.postal_code = postal_code;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public int getTel_no() {
		return tel_no;
	}



	public void setTel_no(int tel_no) {
		this.tel_no = tel_no;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getCredit_card() {
		return credit_card;
	}



	public void setCredit_card(String credit_card) {
		this.credit_card = credit_card;
	}



	public String getCredit_card_type() {
		return credit_card_type;
	}



	public void setCredit_card_type(String credit_card_type) {
		this.credit_card_type = credit_card_type;
	}



	public String getCard_expirary_date() {
		return card_expirary_date;
	}



	public void setCard_expirary_date(String card_expirary_date) {
		this.card_expirary_date = card_expirary_date;
	}



	@Override
	public String toString() {
		return "\nCustomers [customer_id=" + customer_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", address=" + address + ", city=" + city + ", postal_code=" + postal_code + ", country=" + country
				+ ", tel_no=" + tel_no + ", email=" + email + ", credit_card=" + credit_card + ", credit_card_type="
				+ credit_card_type + ", card_expirary_date=" + card_expirary_date + "]";
	}
	
	
	
}


	