package com.seneau.agentservice.web.controller.parametrage;

import com.seneau.agentservice.web.dto.response.parametrage.SecteurDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface SecteurController {
    @GetMapping("/code/{code}")
    SecteurDto getSecteurByCode(@PathVariable String code);
}
