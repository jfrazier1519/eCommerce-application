package demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="Accounts")
public class Account {
	
	@Id
	@Column(name="account_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int accountId;
	
	@OneToOne(cascade = CascadeType.MERGE, fetch=FetchType.EAGER)
	@JoinColumn(name = "customers_FK")
	int customer_id;
	
	@Column(name="username", nullable=false)
	String username;
	
	@Column(name="password", nullable=false)
	String password;
	
	//HOW DO I HANDLE AN INNER JOINS WITH JPA???
	String first_name;
	String last_name;

	public Account(int customer_id, String username, String password, String first_name, String last_name) {
		super();
		this.customer_id = customer_id;
		this.username = username;
		this.password = password;
		this.first_name = first_name;
		this.last_name = last_name;
	}

}
