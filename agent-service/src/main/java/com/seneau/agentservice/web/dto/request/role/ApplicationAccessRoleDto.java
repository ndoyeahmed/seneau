package com.seneau.agentservice.web.dto.request.role;

import com.seneau.agentservice.web.dto.response.application.ApplicationDto;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ApplicationAccessRoleDto {
    private ApplicationDto application;
    private List<ApplicationAccessRolePrivilegeDto> applicationAccessRolePrivileges = new ArrayList<>();
}
