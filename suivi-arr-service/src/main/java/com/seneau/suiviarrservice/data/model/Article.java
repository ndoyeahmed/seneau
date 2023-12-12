package com.seneau.suiviarrservice.data.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Article extends AbstractType {
    private Integer quantiteStock;
    @Column(columnDefinition = "boolean default false")
    private boolean defaut = false;
}
