package com.seneau.suiviarrservice.data.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EDemandeBranchementStep {
        INIT(0),
        PLANNING_METREUR(1),
        METRER_EFFECTUER(2),
        METRER_VALIDER(3),
        DMC_EDITER(4),
        PLANNING_CHEF_EQUIPE(5),
        TRAVAUX_ENCOURS(6),
        TRAVAUX_EFFECTUER(7),
        CLOSE(8);
        private final long stepCongeIndex;
}
