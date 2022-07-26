package service;

import demotest.apirest.entity.Articulos;
import org.springframework.beans.factory.annotation.Autowired;
import repository.ArticulosRepository;

import java.util.List;
import java.util.Optional;

public class ArticulosServiceImpl implements ArticulosService{
    @Autowired
    private ArticulosRepository articulosRepository;

    @Override
    public List<Articulos> findAll() {
        return articulosRepository.findAll();
    }

    @Override
    public Optional<Articulos> findById(int id) {
        return articulosRepository.findById(id);
    }

    @Override
    public void deleteById(int id) {
        articulosRepository.deleteById(id);
    }

    @Override
    public void save(Articulos articulos) {
        articulosRepository.save(articulos);
    }
}
