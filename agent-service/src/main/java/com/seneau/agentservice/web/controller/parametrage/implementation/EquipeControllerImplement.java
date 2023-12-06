package com.seneau.agentservice.web.controller.parametrage.implementation;

import com.seneau.agentservice.data.model.Equipe;
import com.seneau.agentservice.data.repository.EquipeRepository;
import com.seneau.agentservice.web.controller.parametrage.EquipeController;
import com.seneau.agentservice.web.dto.response.parametrage.EquipeDto;
import com.seneau.communs.core.GenericController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/equipe")
public class EquipeControllerImplement extends GenericController<Equipe, EquipeDto, EquipeDto> implements EquipeController {
        public EquipeControllerImplement(EquipeRepository repository) {
        super(repository, Equipe.class, EquipeDto.class);
    }
}
