package com.harena.api.service;

import com.harena.api.repository.model.PatrimoineRepository;
import java.io.File;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import school.hei.patrimoine.modele.Patrimoine;
import school.hei.patrimoine.modele.possession.Possession;

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

  public List<Possession> getPatrimoinePossessions(int page, int size, String nomPatrimoine) {
    return patrimoineRepository.getPatrimoinePossessions(page, size, nomPatrimoine);
  }

  public Possession getPatrimoinePossessionByNom(String nomPossession, String nomPatrimoine) {
    return patrimoineRepository.getPatrimoinePossessionByNom(nomPossession, nomPatrimoine);
  }

  public void deletePatrimoinePossessionByNom(String nomPossession, String nomPatrimoine) {
    patrimoineRepository.deletePatrimoinePossessionByNom(nomPossession, nomPatrimoine);
  }
}
