package service;

import demotest.apirest.entity.Articulos;

import java.util.List;
import java.util.Optional;

public interface ArticulosService {
    public List<Articulos> findAll();
    public Optional<Articulos> findById(int id);
    public void save (Articulos articulos);
    public void deleteById(int id);
}
