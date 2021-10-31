package tn.esprit.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import tn.esprit.demo.entities.Rayon;
import tn.esprit.demo.repository.FournisseurRepository;
import tn.esprit.demo.repository.RayonRepository;

import java.util.List;

public class RayonServiceImpl implements RayonService{

    @Autowired
    private RayonRepository rayonRepository;

    @Override
    public Rayon getRayonById(Long id) {
        return rayonRepository.getById(id);
    }

    @Override
    public void saveRayon(Rayon r) {
        rayonRepository.save(r);
    }

    @Override
    public void updateRayon(Rayon r) {
        rayonRepository.save(r);
    }

    @Override
    public void deleteRayon(Long id) {
        rayonRepository.deleteById(id);
    }

    @Override
    public List<Rayon> getAllRayon() {
        return rayonRepository.findAll();
    }
}
