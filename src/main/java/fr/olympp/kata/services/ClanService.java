package fr.olympp.kata.services;

import fr.olympp.kata.models.Dto.ArmyDto;
import fr.olympp.kata.models.Dto.ClanDto;

import java.util.List;

public interface ClanService {
  ClanDto getClan(String clanName);

  List<ClanDto> getClans();

  void addArmy(String clanName, ArmyDto armyDto);

  void removeArmy(String clanName, String armyName);
}
