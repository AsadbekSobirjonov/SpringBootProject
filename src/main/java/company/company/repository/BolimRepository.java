package company.company.repository;

import company.company.entity.Bolim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BolimRepository extends JpaRepository<Bolim,Long> {
}
