package persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import persistance.Prizes;

@Repository
public interface PrizesRepository extends JpaRepository<Prizes, Long> {
}