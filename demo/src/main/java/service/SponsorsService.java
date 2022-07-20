package service;

import demotest.apirest.entity.Sponsors;
import demotest.apirest.entity.Usuario;

import java.util.List;
import java.util.Optional;

public interface SponsorsService {
    public List<Sponsors> findAll();
    public Optional<Sponsors> findById(int id);
    public void save(Sponsors sponsors);
    public void deleteById(int id);
}
