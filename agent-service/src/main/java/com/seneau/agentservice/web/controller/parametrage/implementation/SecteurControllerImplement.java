package com.seneau.agentservice.web.controller.parametrage.implementation;

import com.seneau.agentservice.data.model.Secteur;
import com.seneau.agentservice.data.repository.SecteurRepository;
import com.seneau.agentservice.service.parametrage.SecteurService;
import com.seneau.agentservice.web.controller.parametrage.SecteurController;
import com.seneau.agentservice.web.dto.response.parametrage.SecteurDto;
import com.seneau.communs.core.GenericController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secteur")
public class SecteurControllerImplement extends GenericController<Secteur, SecteurDto, SecteurDto> implements SecteurController {
    private final SecteurService secteurService;
    public SecteurControllerImplement(SecteurRepository repository, SecteurService secteurService) {
        super(repository, Secteur.class, SecteurDto.class);
        this.secteurService = secteurService;
    }

    @Override
    public SecteurDto getSecteurByCode(String code) {
        return secteurService.getSecteurByCode(code);
    }
}
