package com.seneau.agentservice.data.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "disc")
@DiscriminatorValue(value = "AGENT")
@Table(name = "agents")
public class Agent extends AbstractEntity{
    private Integer matricule;
    private String CIN;
    private String fullName;
    private String situationMatrimoniale;
    private String email;
    private Double taux;
    private String sexe;
    private Date dateNaissance;
    @OneToOne
    private Agent chef;

    @ManyToOne
    @JoinColumn(name = "statut", referencedColumnName = "id")
    private Statut statut;
    @ManyToOne
    @JoinColumn(name = "fonction", referencedColumnName = "id")
    private Fonction fonction;
    @ManyToOne
    @JoinColumn(name = "secteur", referencedColumnName = "id")
    private Secteur secteur; // optional
    @ManyToOne
    @JoinColumn(name = "direction", referencedColumnName = "id")
    private Direction direction; // optional
    @ManyToOne
    @JoinColumn(name = "etablissement", referencedColumnName = "id")
    private Etablissement etablissement; // optional
    @ManyToOne
    @JoinColumn(name = "equipe", referencedColumnName = "id")
    private Equipe equipe;
    @ManyToOne
    @JoinColumn(name = "service", referencedColumnName = "id")
    private Service service; // optional

    @OneToMany(mappedBy = "agent")
    private List<Contrat> contrats;
    @OneToMany(mappedBy = "agent")
    private List<Affectation> affectations;

}

