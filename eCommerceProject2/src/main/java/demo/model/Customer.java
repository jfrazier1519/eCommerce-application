package demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name = "Customers")
public class Customer {

	@Id
	@Column(name = "customer_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int customerId;
	
	@Column(name="username", nullable=false)
	String username;
	
	@Column(name="password", nullable=false)
	String password;

	@Column(name = "first_name", nullable = false)
	String firstName;

	@Column(name = "last_name", nullable = false)
	String lastName;

	@Column(name = "address", nullable = false)
	String address;

	@Column(name = "city", nullable = false)
	String city;

	@Column(name = "postal_code", nullable = false)
	int postalCode;

	@Column(name = "country", nullable = false)
	String country;

	@Column(name = "tel_no", nullable = false)
	long telNo;

	@Column(name = "email", nullable = false)
	String email;

	@Column(name = "credit_card")
	String creditCard;

	@Column(name = "credit_card_type")
	String creditCardType;

	@Column(name = "card_expirary_date")
	String cardExpiraryDate;

	// Constructor without payment info or user/pass
	public Customer(int customerId, String firstName, String lastName, String address, String city, int postalCode,
			String country, long telNo, String email) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.postalCode = postalCode;
		this.country = country;
		this.telNo = telNo;
		this.email = email;
	}
	
	public Customer(String firstName, String lastName, String username, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;

		
	}

}
