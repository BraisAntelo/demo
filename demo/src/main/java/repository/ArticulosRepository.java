package repository;

import demotest.apirest.entity.Articulos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticulosRepository extends JpaRepository<Articulos,Integer> {

}
