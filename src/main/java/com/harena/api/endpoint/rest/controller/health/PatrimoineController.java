package com.harena.api.endpoint.rest.controller.health;

import com.harena.api.service.PatrimoineService;
import java.io.File;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import school.hei.patrimoine.modele.Patrimoine;
import school.hei.patrimoine.modele.possession.Possession;

@AllArgsConstructor
@RestController
public class PatrimoineController {
  private PatrimoineService patrimoineService;

  @GetMapping("/patrimoines")
  public List<Patrimoine> getListePatrimoine(
      @RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size) {
    return patrimoineService.getListePatrimoines(page, size);
  }

  @PostMapping("/patrimoines")
  public Patrimoine crupdatePatrimoines(@RequestBody File file) {
    return patrimoineService.crupdatePatrimoines(file);
  }

  @GetMapping("/patrimoines/{nom_patrimoine}")
  public Patrimoine getPatrimoineByNom(@RequestParam String nomPatrimoine) {
    return patrimoineService.getPatrimoineByNom(nomPatrimoine);
  }

  @PostMapping("/patrimoines/{nom_patrimoine}/possessions")
  public Patrimoine crupdatePatrimoinePossessions(
      @RequestBody File file, @RequestParam String nomPatrimoine) {
    return patrimoineService.crupdatePatrimoinePossessions(file, nomPatrimoine);
  }

  @GetMapping("/patrimoines/{nom_patrimoine}/possessions")
  public List<Possession> getPatrimoinePossessions(
      @RequestParam(defaultValue = "0") int page,
      @RequestParam(defaultValue = "10") int size,
      @RequestParam String nomPatrimoine) {
    return patrimoineService.getPatrimoinePossessions(page, size, nomPatrimoine);
  }

  @GetMapping("/patrimoines/{nom_patrimoine}/possessions/{nom_possession}")
  public Possession getPatrimoinePossessionByNom(
      @RequestParam String nomPossession, @RequestParam String nomPatrimoine) {
    return patrimoineService.getPatrimoinePossessionByNom(nomPossession, nomPatrimoine);
  }

  @DeleteMapping("/patrimoines/{nom_patrimoine}/possessions/{nom_possession}")
  public void deletePatrimoinePossessionByNom(
      @RequestParam String nomPossession, @RequestParam String nomPatrimoine) {
    patrimoineService.deletePatrimoinePossessionByNom(nomPossession, nomPatrimoine);
  }
}
