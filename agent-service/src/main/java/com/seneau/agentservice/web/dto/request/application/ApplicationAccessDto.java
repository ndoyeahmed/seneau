package com.seneau.agentservice.web.dto.request.application;

import com.seneau.agentservice.web.dto.response.application.ApplicationDto;
import com.seneau.agentservice.web.dto.response.role.ApplicationAccessAgentPrivilegesDto;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ApplicationAccessDto {
    private Long id;
    private ApplicationDto application;
    private List<ApplicationAccessAgentPrivilegesDto> applicationAccessAgentPrivileges;
}
