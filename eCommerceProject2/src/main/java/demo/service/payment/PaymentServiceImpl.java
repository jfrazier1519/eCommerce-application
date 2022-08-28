package demo.service.payment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.dao.payment.PaymentDao;
import demo.model.Payment;

@Service
public class PaymentServiceImpl implements PaymentService{
	
	private PaymentDao paymentDao;
	
	@Autowired
	public PaymentServiceImpl(PaymentDao paymentDao) {
		this.paymentDao = paymentDao;
	}
	
	/**
	 * inserts and updates a payment object
	 * 
	 * @param Payment
	 * @return Payment
	 */
	@Override
	public Payment InsertUpdatePayment(Payment payment) {
		// TODO Auto-generated method stub
		return paymentDao.save(payment);
	}
	
	/**
	 *  returns a list of all payments
	 *  
	 *  @return List<Payment>
	 */
	@Override
	public List<Payment> selectAllPayments() {
		// TODO Auto-generated method stub
		return paymentDao.findAll();
	}
}
