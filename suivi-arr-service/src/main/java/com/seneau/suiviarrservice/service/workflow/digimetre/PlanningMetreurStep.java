package com.seneau.suiviarrservice.service.workflow.digimetre;

import com.seneau.suiviarrservice.data.enumeration.EDemandeBranchementStep;
import com.seneau.suiviarrservice.data.model.subclass.DemandeBranchementReport;
import com.seneau.suiviarrservice.service.workflow.DemandeBranchementStep;
import com.seneau.suiviarrservice.web.dto.request.workflow.PlanningMetreurRequestDto;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PlanningMetreurStep extends DemandeBranchementStep {
    private final PlanningMetreurRequestDto planningMetreurRequestDto;

    @Override
    public void processStep(DemandeBranchementReport report) {
        report.getDemandeBranchement().setCurrentStep(EDemandeBranchementStep.PLANNING_METREUR);
    }
}
