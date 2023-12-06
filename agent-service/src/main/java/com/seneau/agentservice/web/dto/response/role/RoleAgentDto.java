package com.seneau.agentservice.web.dto.response.role;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoleAgentDto {
    private Long id;
    private String name;
    private String code;
    private RoleHierarchiqueAgentDto rolesHierarchique;
    private RoleHierarchiqueAgentDto rolesFonctionnel;
}