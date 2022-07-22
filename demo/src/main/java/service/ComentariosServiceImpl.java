package service;

import demotest.apirest.entity.Comentarios;
import org.springframework.beans.factory.annotation.Autowired;
import repository.ComentariosRepository;

import java.util.List;
import java.util.Optional;

public class ComentariosServiceImpl implements ComentariosService{
    @Autowired
    private ComentariosRepository comentariosRepository;
    @Override
    public List<Comentarios>findAll(){return comentariosRepository.findAll();}

    @Override
    public Optional<Comentarios> findById(int id){return comentariosRepository.findById(id);}

    @Override
    public void save(Comentarios comentarios){comentariosRepository.save(comentarios);}

    @Override
    public void deleteById(int id){comentariosRepository.deleteById(id);}
}
