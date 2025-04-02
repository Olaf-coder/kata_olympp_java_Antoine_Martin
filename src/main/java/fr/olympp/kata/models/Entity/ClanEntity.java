package fr.olympp.kata.models.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="clan")
public class ClanEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name", unique=true)
    private String name;

    @OneToMany(mappedBy = "clan", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ArmyEntity> army;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
