package com.seneau.suiviarrservice.data.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ETypeDemandeBranchement {
    SOCIAL (0),
    ORDINNAIRE (1);
    private final long validationIndex;
}
