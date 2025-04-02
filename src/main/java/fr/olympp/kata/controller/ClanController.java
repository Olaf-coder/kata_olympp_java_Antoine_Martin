package fr.olympp.kata.controller;

import fr.olympp.kata.models.Dto.ArmyDto;
import fr.olympp.kata.models.Dto.ClanDto;
import fr.olympp.kata.services.ClanService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clans")
public class ClanController {
  private final ClanService clanService;

  public ClanController(ClanService clanService) {
    this.clanService = clanService;
  }

  @GetMapping
  public List<ClanDto> getClans() {
    return this.clanService.getClans();
  }

  @GetMapping("/{clanName}")
  public ClanDto getClan(@PathVariable String clanName) {
    return this.clanService.getClan(clanName);
  }

  @PostMapping("/{clanName}/armies")
  public void addArmy(@PathVariable String clanName, @RequestBody ArmyDto armyDto) {
    this.clanService.addArmy(clanName, armyDto);
  }

  @DeleteMapping("/{clanName}/armies/{armyName}")
  public void removeArmy(@PathVariable String clanName, @PathVariable String armyName) {
    this.clanService.removeArmy(clanName, armyName);
  }

}
