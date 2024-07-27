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
}
