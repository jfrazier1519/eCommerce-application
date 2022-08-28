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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
	
	@ManyToOne(cascade=CascadeType.MERGE, fetch=FetchType.LAZY)
	@JoinColumn(name="customer_FK")  
	private Customer myCustomer;
	
	@ManyToMany(cascade=CascadeType.MERGE, fetch=FetchType.LAZY)
	private List <Product> myProducts;

	public Order(Date order_date, int quantity, int total, String orderStatus, Customer myCustomer,
			List<Product> myProducts) {
		super();
		this.order_date = order_date;
		this.quantity = quantity;
		this.total = total;
		this.orderStatus = orderStatus;
		this.myCustomer = myCustomer;
		this.myProducts = myProducts;
	}
	
	

}