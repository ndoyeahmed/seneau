package com.seneau.agentservice.web.controller.role;

import com.seneau.agentservice.web.dto.request.role.ApplicationAccessRoleDto;
import com.seneau.agentservice.web.dto.request.role.RolePrivilegeRequestDto;
import com.seneau.agentservice.web.dto.request.application.ApplicationAccessDto;
import com.seneau.agentservice.web.dto.request.application.ApplicationAccessRequestDto;
import com.seneau.agentservice.web.dto.response.role.*;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


public interface RoleController {
    /*@PostMapping("/roles")
    ResponseEntity<RoleResponseDto> createRole(@Valid @RequestBody RoleRequestDto roleRequestDto);
    @GetMapping("/role/{id}")
    ResponseEntity<RoleDto> getRoleById(@PathVariable Long id);*/
    @GetMapping("/hierarchique/{roleId}")
    ResponseEntity<List<RoleHierarchiqueDto>> getListRoleHierarchique(@PathVariable Long roleId);
     @GetMapping("/hierarchique-fonctionnel/{roleId}")
    ResponseEntity<RoleHFDto> getListRoleHierarchiqueFonctionnel(@PathVariable Long roleId);
    @GetMapping("/fonctionnel/{roleId}")
    ResponseEntity<List<RoleFonctionnelDto>> getListRoleFonctionnel(@PathVariable Long roleId);
    @GetMapping("/application-access/{roleId}")
    ResponseEntity<RoleApplicationAccessDto> getRoleApplicationAccessList(@PathVariable Long roleId);
    @PostMapping("/application-access")
    ResponseEntity<ApplicationAccessDto> createApplicationAccess(@Valid @RequestBody ApplicationAccessRequestDto applicationAccessRequestDto);
    @PostMapping("/privilege")
    RolePrivilegeResponseDto createRoleWithPrivilege(@RequestBody RolePrivilegeRequestDto rolePrivilegeRequestDto);
    @DeleteMapping("/privileges/{roleId}")
    RolePrivilegeResponseDto deletePrivilegeFromRole(@PathVariable Long roleId, @RequestBody List<ApplicationAccessRoleDto> applicationAccessRoles);
}
