package com.seneau.suiviarrservice.data.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class DemandeBranchementArticle extends AbstractEntity{
    private Integer quantiteProvisoire;
    private Integer quantiteReel;
    @ManyToOne
    @JoinColumn(name = "demandeBranchement", referencedColumnName = "id")
    private DemandeBranchement demandeBranchement;
    @ManyToOne
    @JoinColumn(name = "article", referencedColumnName = "id")
    private Article article;
}
