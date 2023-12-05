package com.seneau.agentservice.web.controller.parametrage;

import com.seneau.agentservice.web.dto.request.parametrage.FonctionRequestDto;
import com.seneau.agentservice.web.dto.request.role.ApplicationAccessFonctionDto;
import com.seneau.agentservice.web.dto.response.parametrage.FonctionResponseDto;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface FonctionController {
    @PostMapping("/privileges")
    FonctionResponseDto createFonctionWithPrivilege(@RequestBody FonctionRequestDto fonctionRequestDto);
    @DeleteMapping("/privileges/{fonctionId}")
    FonctionResponseDto removeFonctionPrivilege(@PathVariable Long fonctionId, @RequestBody List<ApplicationAccessFonctionDto> applicationAccessFonctionDtos);
}
