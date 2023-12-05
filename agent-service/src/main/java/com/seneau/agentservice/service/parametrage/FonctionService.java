package com.seneau.agentservice.service.parametrage;

import com.seneau.agentservice.web.dto.request.parametrage.FonctionRequestDto;
import com.seneau.agentservice.web.dto.request.role.ApplicationAccessFonctionDto;
import com.seneau.agentservice.web.dto.response.FonctionResponseDto;

import java.util.List;

public interface FonctionService {
    FonctionResponseDto createFonctionWithPrivilege(FonctionRequestDto fonctionRequestDto);
    FonctionResponseDto removeFonctionPrivilege(Long fonctionId, List<ApplicationAccessFonctionDto> applicationAccessFonctionDtos);
}
