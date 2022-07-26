package Controller;

import demotest.apirest.entity.Autor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.AutorService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class AutorRestController {
    @Autowired
    AutorService autorService;
    @GetMapping("/autor")
    public List<Autor> findAll(){
        return autorService.findAll();
    }
    @GetMapping("/autor/{id}")
    public Optional<Autor>findById(@PathVariable int id){
        Optional<Autor>autor = autorService.findById(id);
        if (autor==null){
            throw new RuntimeException("Autor id not found "+id);
        }
        return autor;
    }
    @PostMapping("/autor")
    public void addAutor(@RequestBody Autor autor){
        autor.setId_autor(0);
        Optional<Autor> optionalAutor = autorService.findById(autor.getId_autor());
        if (optionalAutor==null){
            throw new RuntimeException("Autor id not found"+ autor.getId_autor());
        }else {
            autorService.save(autor);
        }
    }

    @PutMapping("/autor")
    public void updateAutor(@RequestBody Autor autor){
        autorService.save(autor);
    }

    @DeleteMapping("/autor/{id}")
    public String deleteAutor(@PathVariable int id){
        Optional<Autor> autor = autorService.findById(id);
        if (autor==null){
            throw new RuntimeException("Autor id not found "+id);
        }
        autorService.deleteById(id);
        return "deleted autor id "+id;
    }
}
