package com.seneau.suiviarrservice.data.model;

import com.seneau.suiviarrservice.data.enumeration.EStatutDemande;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Demande extends AbstractEntity{
    private String referenceBI;
    // date_debut_intervention;
    private LocalDate startDateOfIntervention;
    // date_butoir_metre;
    private LocalDate deadlineDateForCompletion;
    // uo;
    private String codeUO;
    // reference_client;
    private String clientReference;
    // nom_client;
    private String clientLastName;
    // prenom_client;
    private String clientFirstName;

    // telephone_client1;
    private String phoneNumberClient1;
    // telephone_client2;
    private String phoneNumberClient2;

    // adr_complementrue1;
    private String addressComplement1;

    // adr_complementrue;
    private String addressComplement;
    private EStatutDemande statutDemande;
    @ManyToOne
    @JoinColumn(name = "typeDemande", referencedColumnName = "id")
    private TypeDemande typeDemande;
}
