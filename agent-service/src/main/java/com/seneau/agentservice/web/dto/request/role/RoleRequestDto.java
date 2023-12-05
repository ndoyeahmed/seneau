package com.seneau.agentservice.web.dto.request.role;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RoleRequestDto {
    private String name;
    private String code;
    private Long roleHierarchique;
    private Long roleFonctionnel;
    private List<Long> applications;
}
