package Controller;

import demotest.apirest.entity.Sponsors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.ComentariosService;
import service.SponsorsService;
import service.SponsorsServiceImpl;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class SponsorsRestController {
    @Autowired
    SponsorsService sponsorsService;
    @GetMapping("/sponsors")
    public List<Sponsors> findAll(){
        return sponsorsService.findAll();
    }
    @GetMapping("/sponsors/{id}")
    public Optional<Sponsors> findById(@PathVariable int id){
        Optional<Sponsors> sponsors= sponsorsService.findById(id);
        if (sponsors==null){
            throw new RuntimeException("Sponsors id not found "+id);
        }
        return sponsors;
    }
    @PostMapping("/sponsors")
    public Sponsors addSponsors(@RequestBody Sponsors sponsors){
        sponsors.setId_sponsors(0);
        Optional<Sponsors> optionalSponsors= sponsorsService.findById(sponsors.getId_sponsors());
        if (optionalSponsors ==null){
            throw new RuntimeException("Sponsors id not found "+ sponsors.getId_sponsors());
        }else {
            sponsorsService.save(sponsors);
        }
        return sponsors;
    }
    @PutMapping("/sponsors")
    public Sponsors updateSponsors(@RequestBody Sponsors  sponsors){
        sponsorsService.save(sponsors);
        return sponsors;
    }
    @DeleteMapping("/sponsors/{id}")
    public String deleteSponsors(@PathVariable int id){
        Optional<Sponsors> sponsors= sponsorsService.findById(id);
        if (sponsors==null){
            throw new RuntimeException("Sponsors not found id "+id);
        }
        sponsorsService.deleteById(id);
        return "Deleted sponors id "+id;
    }
}
