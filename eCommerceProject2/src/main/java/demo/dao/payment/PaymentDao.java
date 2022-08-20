package demo.dao.payment;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.model.Payment;

public interface PaymentDao extends JpaRepository<Payment, Integer> {

}
