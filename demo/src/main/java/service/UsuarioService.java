package service;

import demotest.apirest.entity.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    public List<Usuario> findAll();
    public Optional<Usuario> findById(int id);
    public void save(Usuario usuario);
    public List<Usuario> findByNombre(String nombre);
    public void deleteById(int id);
    public List<Usuario> findByExample(Usuario user);
}
