package demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="Products")
public class Product {

	@Id
	@Column(name="product_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int product_id;
	
	@Column(name="product_name", nullable=false)
	String product_name;
	
//	@ManyToOne(cascade=CascadeType.MERGE, fetch=FetchType.EAGER)
//	@JoinColumn(name="category_FK")
	
	//This is a ManyToOne to category
	
	int category_id;
	
	@Column(name="quantity", nullable=false)
	int quantity;
	
	@Column(name="price", nullable=false)
	int price;
	
	@Column(name="product_desc", nullable=false)
	String product_desc;
	
	@Column(name="product_review", nullable=false)
	String product_review;
	
	

	public Product(String product_name, int quantity, int price, String product_desc, String product_review) {
		super();
		this.product_name = product_name;
		this.quantity = quantity;
		this.price = price;
		this.product_desc = product_desc;
		this.product_review = product_review;
	}
}
