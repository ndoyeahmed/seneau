package com.seneau.suiviarrservice.data.model.subclass;

import com.seneau.suiviarrservice.data.model.AbstractEntity;
import com.seneau.suiviarrservice.data.model.DemandeBranchement;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class DemandeBranchementReport extends AbstractEntity {
    private Long agentMetreur;
    private Long agentChefEquipe;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "demandeBranchement", referencedColumnName = "id")
    private DemandeBranchement demandeBranchement;
}
