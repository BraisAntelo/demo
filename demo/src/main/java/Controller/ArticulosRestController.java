package Controller;

import demotest.apirest.entity.Articulos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.ArticulosService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ArticulosRestController {
    @Autowired
    private ArticulosService articulosService;

    @GetMapping("/articulos")
    public List<Articulos> findAll(){
        return articulosService.findAll();
    }
    @GetMapping("/articulos/{id}")
    public Optional<Articulos> findById(@PathVariable int id){
        Optional<Articulos> articulo =articulosService.findById(id);
        if (articulo==null){
            throw new RuntimeException("Articulo id not found " +id);
        }
        return articulo;
    }
    @PostMapping("/articulos")
    public void addArticulos(@RequestBody Articulos articulos){
        articulos.setId_articulos(0);
        Optional<Articulos> articulo= articulosService.findById(articulos.getId_articulos());
        if (articulo==null){
            throw new RuntimeException("Articulo id not found " +articulos.getId_articulos());
        }else {
            articulosService.save(articulos);
        }
    }
    @PutMapping("/articulos")
    public void updateArticulos(@RequestBody Articulos articulos){
        articulosService.save(articulos);
    }


    @DeleteMapping("/articulos/{id}")
    public String deleteArticulos(@PathVariable int id){
        Optional<Articulos> articulos= articulosService.findById(id);
        if (articulos==null){
            throw new RuntimeException("Articulo id not found "+id);
        }
        articulosService.deleteById(id);
        return "Deleted articulo id: "+id;
    }
}
