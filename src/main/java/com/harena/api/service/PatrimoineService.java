package com.harena.api.service;

import com.harena.api.repository.model.PatrimoineRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import school.hei.patrimoine.modele.Patrimoine;

import java.io.File;
import java.util.List;

@Service
@AllArgsConstructor

public class PatrimoineService {
    private PatrimoineRepository patrimoineRepository;

    public List<Patrimoine> getListePatrimoines(int page, int size){
        return patrimoineRepository.getListPatrimoines(page, size);
    }

    public Patrimoine crupdatePatrimoines(File file){
        return patrimoineRepository.crupdatePatrimoines(file);
    }
}
