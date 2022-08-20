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

import com.fasterxml.jackson.annotation.JsonBackReference;

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
public class Payment {
	
	@Id
	@Column(name="payment_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int paymentId;
	
	@Column(name="payment_type")
	private String paymentType;
	
	@Column(name="Payment_num")
	private String paymentNum;
	
	@Column(name="payment_expiration")
	private String paymentExpiration;
	
	@Column(name="allowed")
	private String allowed;
	
	@ManyToMany
	@JsonBackReference
	private List<Order> myOrders;

}