package com.harena.api.mapper;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import school.hei.patrimoine.modele.Patrimoine;

import java.util.Set;

@Component
@AllArgsConstructor

public class PatrimoineMapping {
    private final PersonneMapping personneMapping;

    public Patrimoine transformToRestModel(Patrimoine patrimoine) {
        return new Patrimoine(patrimoine.nom(), personneMapping.transformToRestModel(patrimoine.possesseur()), patrimoine.t(), patrimoine.possessions());
    }
}
