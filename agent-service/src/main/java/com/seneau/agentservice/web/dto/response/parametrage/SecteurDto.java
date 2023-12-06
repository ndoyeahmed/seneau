package com.seneau.agentservice.web.dto.response.parametrage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.seneau.agentservice.data.model.Agent;
import com.seneau.agentservice.web.dto.response.agent.AgentDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SecteurDto  {
    private Long id;
    private boolean active = true;
    private String name;
    private String code;
    private AgentDto chef;
}
