package Controller;

import demotest.apirest.entity.Comentarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.ComentariosService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ComentariosRestController {
    @Autowired
    ComentariosService comentariosService;
    @GetMapping("/comentarios")
    public List<Comentarios> findAll(){
        return comentariosService.findAll();
    }
    @GetMapping("/comentarios/{id}")
    public Optional<Comentarios> findById(@PathVariable int id){
        Optional<Comentarios> comentarios= comentariosService.findById(id);
        if (comentarios==null){
            throw new RuntimeException("comentarios id not found "+id);
        }
        return comentarios;
    }
    @PostMapping("/comentarios")
    public Comentarios addComentarios(@RequestBody Comentarios comentario){
        comentario.setId_comentarios(0);
        Optional<Comentarios> comentarios = comentariosService.findById(comentario.getId_comentarios());
        if (comentarios==null){
            throw new RuntimeException("Comentarios id not found "+ comentario.getId_comentarios());
        }else {
            comentariosService.save(comentario);
        }
        return comentario;
    }
    @PutMapping("/comentarios")
    public Comentarios updateComentarios(@RequestBody Comentarios comentario){
        comentariosService.save(comentario);
        return comentario;
    }
    @DeleteMapping("/comentarios/{id}")
    public String deleteComentarios(@PathVariable int id){
        Optional<Comentarios> comentarios = comentariosService.findById(id);
        if (comentarios==null){
            throw new RuntimeException("Comentarios id not found "+id);
        }
        comentariosService.deleteById(id);
        return "Deleted comentario id "+id;
    }
}
