package com.seneau.suiviarrservice.data.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EStatutDemande {
    SUCCESS (0),
    ECHEC (1);
    private final long validationIndex;
}
