package service;

import demotest.apirest.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import repository.UsuarioRepository;

import java.util.List;
import java.util.Optional;

public class UsuarioServiceImpl implements UsuarioService{
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario>findAll(){return usuarioRepository.findAll();}

    @Override
    public Optional<Usuario> findById (int id){
        Optional<Usuario> user = usuarioRepository.findById(id);
        return user;
    }

    @Override
    public void save(Usuario user) {
        usuarioRepository.save(user);
    }

    @Override
    public void deleteById(int id){usuarioRepository.deleteById(id);}

    @Override
    public List<Usuario> findByNombre(String nombre){
        List<Usuario> users = usuarioRepository.findByNombre(nombre);
        return users;
    }
    @Override
    public List<Usuario> findByExample(Usuario user){
        Example<Usuario> userExample= Example.of(user);
        List<Usuario> users = usuarioRepository.findAll(userExample);
        return users;
    }
}
