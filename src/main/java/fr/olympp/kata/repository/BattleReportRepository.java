package fr.olympp.kata.repository;

import fr.olympp.kata.models.Dto.BattleReportDto;

public interface BattleReportRepository {
    void create(BattleReportDto battleReportDto);
}
