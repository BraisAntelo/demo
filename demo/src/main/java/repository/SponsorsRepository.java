package repository;

import demotest.apirest.entity.Sponsors;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SponsorsRepository extends JpaRepository<Sponsors,Integer> {
}
