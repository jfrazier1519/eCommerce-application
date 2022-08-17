package demo.dao.order;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.model.Order;


// --TODO-- will need to create specific hibernate method definitions, to be don by Thursday
public interface OrderDao extends JpaRepository<Order, Integer> {

}
