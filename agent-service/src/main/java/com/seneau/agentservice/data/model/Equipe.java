package com.seneau.agentservice.data.model;

import com.seneau.communs.core.GenericEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Equipe extends AbstractType implements GenericEntity<Equipe> {
    @OneToMany(mappedBy = "equipe")
    private List<Agent> agents = new ArrayList<>();
    @OneToOne
    private Agent chef;
    @ManyToOne
    @JoinColumn(name = "secteur", referencedColumnName = "id")
    private Secteur secteur;

    @Override
    public void update(Equipe source) {
        this.setCode(source.getCode());
        this.setName(source.getName());
        this.setActive(source.isActive());
        this.setAgents(source.getAgents());
        this.setChef(source.getChef());
        this.setSecteur(source.getSecteur());
    }

    @Override
    public Equipe createNewInstance() {
        Equipe equipe = new Equipe();
        equipe.update(this);
        return equipe;
    }
}
