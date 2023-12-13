package com.seneau.suiviarrservice.service.workflow;


import com.seneau.suiviarrservice.data.model.DemandeBranchement;
import com.seneau.suiviarrservice.data.model.subclass.DemandeBranchementReport;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor

public abstract class DemandeBranchementStep {
    public abstract void processStep(DemandeBranchementReport report);
}
