package com.harena.api.repository.model;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import school.hei.patrimoine.modele.Patrimoine;

import java.util.List;

@Repository
@AllArgsConstructor

public class PatrimoineRepository {
    private List<Patrimoine> patrimoines;

    public List<Patrimoine> getPatrimoines() {
        return patrimoines;
    }

    public void setPatrimoines(List<Patrimoine> patrimoines) {
        this.patrimoines = patrimoines;
    }

    public List<Patrimoine> getListePatrimoines(){
        return getPatrimoines().stream().toList();
    }
}
