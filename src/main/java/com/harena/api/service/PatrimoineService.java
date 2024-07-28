package com.harena.api.service;

import com.harena.api.repository.model.PatrimoineRepository;
import java.io.File;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import school.hei.patrimoine.modele.Patrimoine;

@Service
@AllArgsConstructor
public class PatrimoineService {
  private PatrimoineRepository patrimoineRepository;

  public List<Patrimoine> getListePatrimoines(int page, int size) {
    return patrimoineRepository.getListPatrimoines(page, size);
  }

  public Patrimoine crupdatePatrimoines(File file) {
    return patrimoineRepository.crupdatePatrimoines(file);
  }

  public Patrimoine getPatrimoineByNom(String nomPatrimoine) {
    return patrimoineRepository.getPatrimoineByNom(nomPatrimoine);
  }

  public Patrimoine crupdatePatrimoinePossessions(File file, String nomPatrimoine) {
    return patrimoineRepository.crupdatePatrimoinePossessions(file, nomPatrimoine);
  }
}
