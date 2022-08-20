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
	
	@Column(name="payment_status")
	private String paymentStatus;
	
	@Column(name="payment_date")
	private int paymentDate;
	
	@Column(name="allowed")
	private String allowed;
	
	@ManyToMany(cascade=CascadeType.MERGE, fetch=FetchType.EAGER)
	@JsonBackReference
	private List<Order> myOrders;

}