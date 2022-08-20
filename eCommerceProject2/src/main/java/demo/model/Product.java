package demo.model;

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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "Products")
public class Product {

	@Id
	@Column(name = "product_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int product_id;

	@Column(name = "product_name", nullable = false)
	private String product_name;

	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	private Category category;

	@Column(name = "quantity", nullable = false)
	private int quantity;

	@Column(name = "price", nullable = false)
	private int price;

	@Column(name = "product_desc", nullable = false)
	private String product_desc;

	@Column(name = "product_review", nullable = false)
	private String product_review;
	
	@ManyToMany
	@JsonBackReference
	private List<Order> Orders;

	public Product(String product_name, Category category, int quantity, int price, String product_desc,
			String product_review) {
		super();
		this.product_name = product_name;
		this.category = category;
		this.quantity = quantity;
		this.price = price;
		this.product_desc = product_desc;
		this.product_review = product_review;
	}

	@Override
	public String toString() {
		return "\nProduct [product_id=" + product_id + ", product_name=" + product_name + ", category=" + category
				+ ", quantity=" + quantity + ", price=" + price + ", product_desc=" + product_desc + ", product_review="
				+ product_review + "]";
	}
	
	

}
