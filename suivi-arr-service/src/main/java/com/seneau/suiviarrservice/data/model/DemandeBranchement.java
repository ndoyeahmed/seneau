package com.seneau.suiviarrservice.data.model;

import com.seneau.suiviarrservice.data.enumeration.EDemandeBranchementStep;
import com.seneau.suiviarrservice.data.enumeration.ETypeDemandeBranchement;
import com.seneau.suiviarrservice.data.model.subclass.DemandeBranchementReport;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class DemandeBranchement extends Demande{
    @OneToOne(mappedBy = "demandeBranchement")
    private DemandeBranchementReport demandeBranchementReport;

    private ETypeDemandeBranchement typeDemandeBranchement;
    private EDemandeBranchementStep currentStep = EDemandeBranchementStep.INIT;
}
