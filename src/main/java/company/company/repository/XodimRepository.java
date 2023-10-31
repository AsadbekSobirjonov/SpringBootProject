package company.company.repository;

import company.company.entity.Xodim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface XodimRepository extends JpaRepository<Xodim,Long> {
}
