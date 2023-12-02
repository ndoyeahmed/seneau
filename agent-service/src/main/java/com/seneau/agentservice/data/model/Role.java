package com.seneau.agentservice.data.model;

import com.seneau.communs.core.GenericEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Role extends AbstractType implements GenericEntity<Role> {
    @JoinColumn(unique = false)
    @OneToOne
    Role rolesHierarchique;
    @JoinColumn(unique = false)
    @OneToOne
    Role rolesFonctionnel;
    @OneToMany(mappedBy = "role")
    private List<ApplicationAccessRole> applicationAccessRoles = new ArrayList<>();

    @Override
    public void update(Role source) {
        this.setCode(source.getCode());
        this.setName(source.getName());
        this.setApplicationAccessRoles(source.getApplicationAccessRoles());
        this.setActive(source.isActive());
    }

    @Override
    public Role createNewInstance() {
        Role role = new Role();
        role.update(this);
        return role;
    }
}
