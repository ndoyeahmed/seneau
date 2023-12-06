package com.seneau.agentservice.data.repository;

import com.seneau.agentservice.data.model.Secteur;
import com.seneau.agentservice.web.dto.response.parametrage.SecteurDto;
import com.seneau.communs.core.GenericRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface SecteurRepository extends GenericRepository<Secteur> {
    Secteur findByNameAndActiveTrue(String name);
    @Query("SELECT new com.seneau.agentservice.web.dto.response.parametrage.SecteurDto(s.id, s.active, s.name, s.code, " +
            "new com.seneau.agentservice.web.dto.response.agent.AgentDto(a.id, a.active, a.matricule, a.fullName, a.email, a.taux, a.sexe, a.dateNaissance))" +
            " FROM Secteur s JOIN s.chef a WHERE s.active=true AND s.code=:code")
    Optional<SecteurDto> findByCodeAndActiveTrue(@Param("code") String code);
}
