package com.seneau.agentservice.web.controller.parametrage.implementation;

import com.seneau.agentservice.data.model.Fonction;
import com.seneau.agentservice.data.repository.FonctionRepository;
import com.seneau.agentservice.service.parametrage.FonctionService;
import com.seneau.agentservice.web.controller.parametrage.FonctionController;
import com.seneau.agentservice.web.dto.request.parametrage.FonctionRequestDto;
import com.seneau.agentservice.web.dto.request.role.ApplicationAccessFonctionDto;
import com.seneau.agentservice.web.dto.response.parametrage.FonctionResponseDto;
import com.seneau.communs.core.GenericController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/fonction")
public class FonctionControllerImplement extends GenericController<Fonction, FonctionResponseDto, FonctionRequestDto> implements FonctionController {
    private final FonctionService fonctionService;
    public FonctionControllerImplement(FonctionRepository fonctionRepository, FonctionService fonctionService) {
        super(fonctionRepository, Fonction.class, FonctionResponseDto.class);
        this.fonctionService = fonctionService;
    }

    @Override
    public FonctionResponseDto createFonctionWithPrivilege(FonctionRequestDto fonctionRequestDto) {
        return fonctionService.createFonctionWithPrivilege(fonctionRequestDto);
    }

    @Override
    public FonctionResponseDto removeFonctionPrivilege(Long fonctionId, List<ApplicationAccessFonctionDto> applicationAccessFonctionDtos) {
        return null;
    }

}
