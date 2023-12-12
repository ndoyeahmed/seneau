package com.seneau.suiviarrservice.service.workflow.digimetre;

import com.seneau.suiviarrservice.data.enumeration.EDemandeBranchementStep;
import com.seneau.suiviarrservice.data.model.subclass.DemandeBranchementReport;
import com.seneau.suiviarrservice.service.workflow.DemandeBranchementStep;
import com.seneau.suiviarrservice.web.dto.request.workflow.DmcEditerRequestDto;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DmcEditerStep extends DemandeBranchementStep {
    private final DmcEditerRequestDto dmcEditerRequestDto;
    @Override
    public void processStep(DemandeBranchementReport report) {
        report.getDemandeBranchement().setCurrentStep(EDemandeBranchementStep.DMC_EDITER);
    }
}
