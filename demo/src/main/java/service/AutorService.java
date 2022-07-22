package service;

import demotest.apirest.entity.Autor;

import java.util.List;
import java.util.Optional;

public interface AutorService {
    public List<Autor> findAll();
    public Optional<Autor> findById(int id);
    public void save(Autor autor);
    public void deleteById(int id);
}
