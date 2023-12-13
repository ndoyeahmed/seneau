package com.seneau.suiviarrservice.service.workflow.digimetre;

import com.seneau.suiviarrservice.data.enumeration.EDemandeBranchementStep;
import com.seneau.suiviarrservice.data.model.subclass.DemandeBranchementReport;
import com.seneau.suiviarrservice.service.workflow.DemandeBranchementStep;

public class CloseServiceStep extends DemandeBranchementStep {

    @Override
    public void processStep(DemandeBranchementReport report) {
        report.getDemandeBranchement().setCurrentStep(EDemandeBranchementStep.CLOSE);
    }
}