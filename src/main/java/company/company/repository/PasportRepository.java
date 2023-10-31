package company.company.repository;

import company.company.entity.Pasport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PasportRepository extends JpaRepository<Pasport,Long> {
}
