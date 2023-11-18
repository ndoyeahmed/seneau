package com.seneau.agentservice.web.controller.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RoleDto {
    private Long id;
    private String name;
    private RoleDto rolesHierarchique;
}