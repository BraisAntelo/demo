package service;

import demotest.apirest.entity.Sponsors;
import org.springframework.beans.factory.annotation.Autowired;
import repository.SponsorsRepository;

import java.util.List;
import java.util.Optional;

public class SponsorsServiceImpl implements SponsorsService{
    @Autowired
    private SponsorsRepository sponsorsRepository;

    @Override
    public List<Sponsors> findAll(){return sponsorsRepository.findAll();}

    @Override
    public Optional<Sponsors> findById(int id){
        Optional<Sponsors> sponsors = sponsorsRepository.findById(id);
        return sponsors;
    }

    @Override
    public void save(Sponsors sponsors){sponsorsRepository.save(sponsors);}

    @Override
    public void deleteById(int id){sponsorsRepository.deleteById(id);}

}
