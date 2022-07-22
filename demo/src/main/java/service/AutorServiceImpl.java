package service;

import demotest.apirest.entity.Autor;
import org.springframework.beans.factory.annotation.Autowired;
import repository.AutorRepository;

import java.util.List;
import java.util.Optional;

public class AutorServiceImpl implements AutorService{
    @Autowired
    private AutorRepository autorRepository;

    @Override
    public List<Autor> findAll(){return autorRepository.findAll();}

    @Override
    public Optional<Autor> findById(int id){return autorRepository.findById(id);}

    @Override
    public void save(Autor autor){
        autorRepository.save(autor);
    }

    @Override
    public void deleteById(int id){
        autorRepository.deleteById(id);
    }
}
