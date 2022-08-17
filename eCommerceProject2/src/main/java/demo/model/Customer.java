package demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Customer {

	int customer_id;
	String first_name;
	String last_name;
	String address;
	String city;
	int postal_code;
	String country;
	long tel_no;
	String email;
	String credit_card;
	String credit_card_type;
	String card_expirary_date;

	public Customer(int customer_id, String first_name, String last_name, String address, String city, int postal_code,
			String country, long tel_no, String email) {
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
	}

}
