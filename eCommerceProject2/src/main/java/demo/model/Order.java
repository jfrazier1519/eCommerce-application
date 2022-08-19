package demo.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

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
@Table(name="orders")
public class Order {
	
	@Id
	@Column(name="order_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int order_id;
	
	@Column(name="order_date")
	private Date order_date;
	
	@Column(name="total_quantity")
	private int quantity;
	
	@Column(name="price_total")
	private int total;
	
	@Column(name="order_status")
	private String orderStatus;
	
//	@ManyToOne(cascade=CascadeType.MERGE, fetch=FetchType.EAGER)
//	@Column(name="customer_FK")  // Project won't run with this. ManyToOne and Column can't both be here apparently
//	@JsonBackReference
//	private Customer myCustomer;
	
	// TODO ManyToMany Relationships on payment table and product table
	
//	@ManyToMany(cascade=CascadeType.MERGE, fetch=FetchType.EAGER)
//	@JsonManagedReference
//	private List <Payment> myPayments;
	
//	@ManyToMany(cascade=CascadeType.MERGE, fetch=FetchType.EAGER)
//	@JsonManagedReference
//	private List <Product> myProducts;

}