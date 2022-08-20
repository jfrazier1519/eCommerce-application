package demo.service.payment;

import java.util.List;

import demo.model.Payment;

public interface PaymentService {
	
	public Payment InsertUpdatePayment(Payment payment);
	public List<Payment> selectAllPayments();
}
