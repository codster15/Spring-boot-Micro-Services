package in.jpa_CompositeKey;

import in.jpa_CompositeKey.Entity.account;
import in.jpa_CompositeKey.Entity.accountPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface jpaRepo extends JpaRepository<account, accountPK> {

}
