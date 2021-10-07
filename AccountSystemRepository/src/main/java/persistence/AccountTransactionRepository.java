package persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import persistance.AccountType;

@Repository
public interface AccountTransactionRepository extends JpaRepository<AccountType, Long> {
}