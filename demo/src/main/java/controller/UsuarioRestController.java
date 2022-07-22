package controller;

import demotest.apirest.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.UsuarioService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/demo")
public class UsuarioRestController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/usuario")
    public List<Usuario> findAll() {
        //retornará todos los casos
        return usuarioService.findAll();
    }

    @GetMapping("/usuario/{id}")
    public Optional<Usuario> findById(@PathVariable int id){
        Optional<Usuario> usuario= usuarioService.findById(id);

        if(usuario==null) {
            throw new RuntimeException("Caso id not found " +id);
        }

        return usuario;

    }
    @PostMapping("/usuario")
    public Usuario addUsuario(@RequestBody Usuario usuario){
        usuario.setId_usuario(0);
        Optional<Usuario> us= usuarioService.findById(usuario.getId_usuario());
        if (us==null){
            throw new RuntimeException("El usuario "+usuario.getId_usuario()+" no existe");
        }else {
            usuarioService.save(usuario);
        }
        return usuario;
    }
    @PutMapping("/usuario")
    public Usuario updateUsuario(@RequestBody Usuario usuario){
        usuarioService.save(usuario);
        return usuario;
    }

    @DeleteMapping("/usuario/{id}")
    public String deleteUsuario(@PathVariable int id){
        Optional<Usuario> us =usuarioService.findById(id);
        if(us==null){
            throw new RuntimeException("Usuario id not found "+ id);
        }
        usuarioService.deleteById(id);
        return "Usuario"+ id +"borrado";
    }
}
