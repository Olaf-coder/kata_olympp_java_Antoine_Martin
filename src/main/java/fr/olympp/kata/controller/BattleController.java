package fr.olympp.kata.controller;

import fr.olympp.kata.models.Dto.BattleReportDto;
import fr.olympp.kata.models.Dto.ClanDto;
import fr.olympp.kata.services.BattleService;
import fr.olympp.kata.services.ClanService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/battles")
public class BattleController {
  private BattleService battleService;
  private ClanService clanServices;

  public BattleController(BattleService battleService, ClanService clanService) {
    this.battleService = battleService;
    this.clanServices = clanService;
  }

  @GetMapping
  public BattleReportDto battle() {
    List<ClanDto> clanDtos = this.clanServices.getClans();
    return this.battleService.battle(clanDtos.getFirst(), clanDtos.getLast());
  }
}
