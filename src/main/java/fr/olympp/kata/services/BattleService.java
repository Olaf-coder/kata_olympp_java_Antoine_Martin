package fr.olympp.kata.services;

import fr.olympp.kata.models.Dto.BattleReportDto;
import fr.olympp.kata.models.Dto.ClanDto;

public interface BattleService {
  // responsible to solve the battle between two clans
  BattleReportDto battle(ClanDto clanDto1, ClanDto clanDto2);





}
