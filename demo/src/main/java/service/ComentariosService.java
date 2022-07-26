package service;

import demotest.apirest.entity.Comentarios;

import java.util.List;
import java.util.Optional;

public interface ComentariosService {
    public List<Comentarios> findAll();

    public Optional<Comentarios> findById(int id);

    public void save(Comentarios comentarios);

    public void deleteById(int id);


}
