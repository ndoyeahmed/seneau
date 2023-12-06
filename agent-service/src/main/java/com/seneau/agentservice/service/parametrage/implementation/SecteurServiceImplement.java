package com.seneau.agentservice.service.parametrage.implementation;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.seneau.agentservice.data.repository.SecteurRepository;
import com.seneau.agentservice.service.parametrage.SecteurService;
import com.seneau.agentservice.web.dto.response.parametrage.SecteurDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SecteurServiceImplement implements SecteurService {
    private final SecteurRepository secteurRepository;
    private final ObjectMapper mapper;
    @Override
    public SecteurDto getSecteurByCode(String code) {
        return secteurRepository.findByCodeAndActiveTrue(code).orElse(null);
    }
}
