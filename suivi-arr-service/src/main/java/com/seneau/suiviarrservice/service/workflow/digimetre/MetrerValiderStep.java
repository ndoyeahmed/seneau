package com.seneau.suiviarrservice.service.workflow.digimetre;

import com.seneau.suiviarrservice.data.enumeration.EDemandeBranchementStep;
import com.seneau.suiviarrservice.data.model.subclass.DemandeBranchementReport;
import com.seneau.suiviarrservice.service.workflow.DemandeBranchementStep;
import com.seneau.suiviarrservice.web.dto.request.workflow.MetrervaliderRequestDto;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MetrerValiderStep extends DemandeBranchementStep {
    private final MetrervaliderRequestDto metrervaliderRequestDto;

    @Override
    public void processStep(DemandeBranchementReport report) {
        report.getDemandeBranchement().setCurrentStep(EDemandeBranchementStep.METRER_VALIDER);
    }
}
