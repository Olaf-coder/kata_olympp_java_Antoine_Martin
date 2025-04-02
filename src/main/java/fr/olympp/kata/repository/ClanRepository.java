package fr.olympp.kata.repository;

import fr.olympp.kata.models.Dto.ClanDto;

import java.util.List;

public interface ClanRepository {

    public void addClan(ClanDto clanDto);

    public ClanDto updateClan(ClanDto clanDto);

    public ClanDto getClan(String name);

    List<ClanDto> getClans();
}
