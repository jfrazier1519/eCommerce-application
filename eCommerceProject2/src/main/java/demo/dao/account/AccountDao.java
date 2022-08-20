package demo.dao.account;
import org.springframework.data.jpa.repository.JpaRepository;
import demo.model.Account;

public interface AccountDao extends JpaRepository<Account, Integer>{

		//public Account selectByUser(String user, String pass);
		
		
}
