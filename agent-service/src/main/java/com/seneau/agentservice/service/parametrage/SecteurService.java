package com.seneau.agentservice.service.parametrage;

import com.seneau.agentservice.web.dto.response.parametrage.SecteurDto;

public interface SecteurService {
    SecteurDto getSecteurByCode(String code);
}
