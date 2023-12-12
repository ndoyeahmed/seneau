package com.seneau.suiviarrservice.data.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class TypeDemande extends AbstractType{
    private int delaiTravaux;
    private int delaiMetrer;
}
