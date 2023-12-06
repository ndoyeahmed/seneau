package com.seneau.agentservice.data.model;

import com.seneau.communs.core.GenericEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@SQLDelete(sql = "UPDATE secteur SET active = 0 WHERE id=?")
public class Secteur extends AbstractType implements GenericEntity<Secteur> {
    @ManyToOne
    @JoinColumn(name = "etablissement", referencedColumnName = "id")
    private Etablissement etablissement;
    @ManyToOne
    @JoinColumn(name = "chef", referencedColumnName = "id")
    private Agent chef;
    @OneToMany(mappedBy = "secteur")
    private List<Equipe> equipes = new ArrayList<>();

    @Override
    public void update(Secteur source) {
        this.setCode(source.getCode());
        this.setName(source.getName());
        this.setActive(source.isActive());
        this.setChef(source.getChef());
        this.setEtablissement(source.getEtablissement());
        this.setEquipes(source.getEquipes());
    }

    @Override
    public Secteur createNewInstance() {
        Secteur secteur = new Secteur();
        secteur.update(this);
        return secteur;
    }
}
