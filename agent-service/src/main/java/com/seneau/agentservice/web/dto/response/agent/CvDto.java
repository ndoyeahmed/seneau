package com.seneau.agentservice.web.dto.response.agent;

import com.seneau.agentservice.web.dto.response.parametrage.ProjetDto;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CvDto {
    private Long agent;
    private String formations;
    private List<ProjetDto> projets;
}
