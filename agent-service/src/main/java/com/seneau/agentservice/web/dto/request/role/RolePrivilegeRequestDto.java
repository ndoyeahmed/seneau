package com.seneau.agentservice.web.dto.request.role;

import com.seneau.communs.data.dto.role.RoleDto;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class RolePrivilegeRequestDto {
    private Long id;
    private String name;
    private String code;
    private RoleDto rolesHierarchique;
    private RoleDto rolesFonctionnel;
    private List<ApplicationAccessRoleDto> applicationAccessRoles = new ArrayList<>();
}
