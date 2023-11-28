package com.seneau.agentservice.web.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoleHierarchiqueDto {
    private Long id;
    private String name;
    private String code;
    private RoleHierarchiqueAgentDto rolesHierarchique;
}