package com.harena.api.endpoint.rest.controller.health;

import com.harena.api.service.PatrimoineService;
import java.io.File;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import school.hei.patrimoine.modele.Patrimoine;

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
}
