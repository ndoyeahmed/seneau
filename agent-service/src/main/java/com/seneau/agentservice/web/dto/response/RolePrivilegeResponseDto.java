package com.seneau.agentservice.web.dto.response;

import com.seneau.agentservice.web.dto.request.role.ApplicationAccessRoleDto;
import com.seneau.communs.data.dto.role.RoleDto;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RolePrivilegeResponseDto {
    private Long id;
    private String name;
    private String code;
    private RoleDto rolesHierarchique;
    private RoleDto rolesFonctionnel;
    private List<ApplicationAccessRoleDto> ApplicationAccessRole;
}
