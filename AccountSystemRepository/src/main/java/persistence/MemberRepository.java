package persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import persistance.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}