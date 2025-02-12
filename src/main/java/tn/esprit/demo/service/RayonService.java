package tn.esprit.demo.service;

import tn.esprit.demo.entities.Produit;
import tn.esprit.demo.entities.Rayon;
import tn.esprit.demo.entities.Stock;


import java.util.List;

public interface RayonService {
    public abstract List<Rayon> getAllRayon();
    public abstract Rayon getRayon(Long id);
    public abstract void saveRayon(Rayon r);
}
