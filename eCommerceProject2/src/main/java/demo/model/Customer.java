package demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "Customers")
public class Customer {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int customer_id;
	
	@Column(name="username", nullable=false)
	String username;
	
	@Column(name="password", nullable=false)
	String password;

	@Column(name = "first_name", nullable = false)
	String first_name;

	@Column(name = "last_name", nullable = false)
	String last_name;

	@Column(name = "address", nullable = false)
	String address;

	@Column(name = "city", nullable = false)
	String city;

	@Column(name = "postal_code", nullable = false)
	int postal_code;

	@Column(name = "country", nullable = false)
	String country;

	@Column(name = "tel_no", nullable = false)
	long tel_no;

	@Column(name = "email", nullable = false)
	String email;

	@Column(name = "credit_card", nullable = false)
	String credit_card;

	@Column(name = "credit_card_type", nullable = false)
	String credit_card_type;

	@Column(name = "card_expirary_date", nullable = false)
	String card_expirary_date;

	// Constructor without payment info or user/pass
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
	
	public Customer(String first_name, String last_name, String username, String password) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.username = username;
		this.password = password;

		
	}

}
