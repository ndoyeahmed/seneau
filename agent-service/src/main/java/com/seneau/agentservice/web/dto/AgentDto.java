package com.seneau.agentservice.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AgentDto implements Serializable {
    private Long id;
    private boolean active = true;
    private Integer matricule;
    private String fullName;
    private String email;
    private Double taux;
    private String sexe;
    private Date dateNaissance;
}
