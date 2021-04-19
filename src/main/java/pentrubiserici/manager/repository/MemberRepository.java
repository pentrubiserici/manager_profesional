package pentrubiserici.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pentrubiserici.manager.model.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

}
