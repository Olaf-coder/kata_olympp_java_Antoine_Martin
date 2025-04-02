package fr.olympp.kata.models.Entity;

import fr.olympp.kata.models.Dto.FootSoldiersDto;
import jakarta.persistence.*;

@Entity
@Table(name="army")
public class ArmyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="armyAttack")
    private int armyAttack;

    @Column(name="armyDefense")
    private int armyDefense;

    @OneToOne(mappedBy = "army", cascade = CascadeType.ALL)
    private FootSoldiersEntity footSoldiers;

    @ManyToOne
    @JoinColumn(name="clan_id")
    private ClanEntity clan;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FootSoldiersEntity getFootSoldiers() {
        return footSoldiers;
    }

    public void setFootSoldiers(FootSoldiersEntity footSoldiers) {
        this.footSoldiers = footSoldiers;
    }

    public int getArmyAttack() {
        return armyAttack;
    }

    public void setArmyAttack(int armyAttack) {
        this.armyAttack = armyAttack;
    }

    public int getArmyDefense() {
        return armyDefense;
    }

    public void setArmyDefense(int armyDefense) {
        this.armyDefense = armyDefense;
    }
}
