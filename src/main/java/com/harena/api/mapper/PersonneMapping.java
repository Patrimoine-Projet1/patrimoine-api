package com.harena.api.mapper;

import org.springframework.stereotype.Component;
import school.hei.patrimoine.modele.Personne;

@Component

public class PersonneMapping {
    public Personne transformToRestModel(Personne personne){
        return new Personne(personne.nom());
    }
}
