package com.seneau.suiviarrservice.web.controller;


import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/paremetrage")
public interface ParametrageDemandeController {
    @PostMapping("/type/demande")
    ResponseEntity<TypeDemandeResponseDto> createTypeDemande(@Valid @RequestBody TypeDemandeRequestCreateDto typeDemandeRequest);
    @PutMapping("/type/demande/{id}")
    ResponseEntity<TypeDemandeResponseDto> updateTypeDemande(@PathVariable Long id,@Valid @RequestBody TypeDemandeRequestCreateDto typeDemandeRequest);
    @GetMapping("/type/demande")
    ResponseEntity<List<TypeDemandeResponseDto>> getTypeDemande();
    @GetMapping("/type/demande/{id}")
    ResponseEntity<TypeDemandeResponseDto> getTypeDemande(@PathVariable Long id);
}
