package fr.olympp.kata.models.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="footSoldiers")
public class FootSoldiersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name="nbUnits")
    private int nbUnits;

    @Column(name="attack")
    private int attack;

    @Column(name="defense")
    private int defense;

    @Column(name="health")
    private int health;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="army_id")
    private ArmyEntity army;



    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public int getNbUnits() {
        return nbUnits;
    }

    public void setNbUnits(int nbUnits) {
        this.nbUnits = nbUnits;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public ArmyEntity getArmy() {
        return army;
    }

    public void setArmy(ArmyEntity army) {
        this.army = army;
    }
}
