package demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Payment {

	int payment_id;
	String payment_type;
	String payment_status;
	int payment_date;
	String allowed;

}