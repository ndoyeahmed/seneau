package com.seneau.agentservice.web.dto.request.role;

import com.seneau.communs.data.dto.role.PrivilegeResponseDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApplicationAccessRolePrivilegeDto {
    private ApplicationAccessRolePrivilegeDto applicationAccessRolePrivileges;
    private PrivilegeResponseDto privilege;
}
