package com.seneau.suiviarrservice.service.workflow.digimetre;

import com.seneau.suiviarrservice.data.enumeration.EDemandeBranchementStep;
import com.seneau.suiviarrservice.data.model.subclass.DemandeBranchementReport;
import com.seneau.suiviarrservice.service.workflow.DemandeBranchementStep;
import com.seneau.suiviarrservice.web.dto.request.workflow.PlanningChefEquipeRequestDto;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PlanningChefEquipeStep extends DemandeBranchementStep {
    private final PlanningChefEquipeRequestDto planningChefEquipeRequestDto;

    @Override
    public void processStep(DemandeBranchementReport report) {
        report.getDemandeBranchement().setCurrentStep(EDemandeBranchementStep.PLANNING_CHEF_EQUIPE);
    }
}
