package repository;

import demotest.apirest.entity.Comentarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComentariosRepository extends JpaRepository<Comentarios,Integer> {
}
