package com.seneau.suiviarrservice.service.workflow.digimetre;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.seneau.suiviarrservice.data.enumeration.EDemandeBranchementStep;
import com.seneau.suiviarrservice.data.enumeration.EStatutValidation;
import com.seneau.suiviarrservice.data.model.DemandeBranchement;
import com.seneau.suiviarrservice.data.model.subclass.DemandeBranchementReport;
import com.seneau.suiviarrservice.service.workflow.DemandeBranchementStep;
import com.seneau.suiviarrservice.web.dto.request.workflow.PlanningMetreurRequestDto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ServiceDemandeBranchementWorkflow {
    private final DemandeBranchementReport report;
    private DemandeBranchementStep currentStep;


    public void advanceToNextStep(Object request, EDemandeBranchementStep nextStep) {
        ObjectMapper objectMapper = new ObjectMapper();
        switch (nextStep) {
            case PLANNING_METREUR -> {
                currentStep = new PlanningMetreurStep((PlanningMetreurRequestDto) request);
            }
            case CLOSE-> {currentStep=new CloseServiceStep();}
        }
    }
    public void processCurrentStep() {
        currentStep.processStep(report);
    }

}
