package com.seneau.agentservice.web.controller.role.implementation;

import com.seneau.agentservice.data.model.Role;
import com.seneau.agentservice.data.repository.RoleRepository;
import com.seneau.agentservice.service.role.RoleService;
import com.seneau.agentservice.web.controller.role.RoleController;
import com.seneau.agentservice.web.dto.*;
import com.seneau.agentservice.web.dto.request.role.RolePrivilegeRequestDto;
import com.seneau.agentservice.web.dto.response.RolePrivilegeResponseDto;
import com.seneau.communs.core.GenericController;
import com.seneau.communs.core.GenericRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RoleControllerImplement extends GenericController<Role, RolePrivilegeResponseDto, RolePrivilegeRequestDto> implements RoleController {
    private final RoleService roleService;

    public RoleControllerImplement(RoleRepository repository, RoleService roleService) {
        super(repository, Role.class, RolePrivilegeResponseDto.class);
        this.roleService = roleService;
    }


    /* @Override
     public ResponseEntity<RoleResponseDto> createRole(RoleRequestDto roleRequestDto) {
         return ResponseEntity.status(HttpStatus.CREATED).body(roleService.createRole(roleRequestDto));
     }

     @Override
     public ResponseEntity<RoleDto> getRoleById(Long id) {
         return ResponseEntity.ok(roleService.getRoleById(id));
     }
 */
    @Override
    public ResponseEntity<List<RoleHierarchiqueDto>> getListRoleHierarchique(Long roleId) {
        return ResponseEntity.ok(roleService.getListRoleHierarchiqueByRoleId(roleId));
    }

    @Override
    public ResponseEntity<RoleHFDto> getListRoleHierarchiqueFonctionnel(Long roleId) {
        return ResponseEntity.ok(roleService.getListRoleHierarchiqueFonctionnelByRoleId(roleId));
    }

    @Override
    public ResponseEntity<List<RoleFonctionnelDto>> getListRoleFonctionnel(Long roleId) {
        return ResponseEntity.ok(roleService.getListRoleFonctionnelByRoleId(roleId));
    }

    @Override
    public ResponseEntity<RoleApplicationAccessDto> getRoleApplicationAccessList(Long roleId) {
        return ResponseEntity.ok(roleService.getRoleApplicationAccessList(roleId));
    }

    @Override
    public ResponseEntity<ApplicationAccessDto> createApplicationAccess(ApplicationAccessRequestDto applicationAccessRequestDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(roleService.createApplicationAccess(applicationAccessRequestDto));
    }

    @Override
    public RolePrivilegeResponseDto createRoleWithPrivilege(RolePrivilegeRequestDto rolePrivilegeRequestDto) {
        return roleService.createRoleWithPrivilege(rolePrivilegeRequestDto);
    }
}
