package com.seneau.agentservice.web.controller.agent;

import com.seneau.agentservice.web.dto.request.agent.AgentRequest;
import com.seneau.agentservice.web.dto.response.agent.AgentDto;
import com.seneau.agentservice.web.dto.response.agent.AgentResponse;
import com.seneau.agentservice.web.dto.response.agent.CvDto;
import com.seneau.agentservice.web.dto.FilterDto;
import com.seneau.communs.data.dto.agent.AgentResponseDto;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Map;

public interface AgentController {
    @PostMapping
    ResponseEntity<AgentResponse> createAgent(@Valid @RequestBody AgentRequest agentRequest);
    @PostMapping("/create/all")
    ResponseEntity<List<AgentResponse>> createAll(@RequestParam MultipartFile file, @RequestParam Integer numberOfSheet) throws IOException, ParseException;
    @PutMapping("/{id}")
    ResponseEntity<AgentResponse> updateAgent(@PathVariable Long id, @Valid @RequestBody AgentRequest agentRequest);
    @GetMapping
    ResponseEntity<Map<String, Object>> getAllAgent(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "5") int size);
    @PostMapping("/filtered")
    ResponseEntity<Map<String, Object>> getAllAgentFiltered(@RequestBody FilterDto filterDto);
    @GetMapping("/matricule/{matricule}")
    ResponseEntity<AgentResponse> getAgentByMatricule(@PathVariable Integer matricule);
    @PostMapping("/listDtoAgentmatricules/all")
    ResponseEntity<List<AgentResponse>> getAllAgentByMatricules(@RequestBody List<Integer> matricules);
    @GetMapping("/n1/{id}")
    ResponseEntity<List<AgentResponse>> getAgentsByIdN1(@PathVariable Long id);
    @GetMapping("/directeur/{matriculeDirecteur}")
    ResponseEntity<List<AgentResponse>> getAgentsByMatriculeDirecteur(@PathVariable Integer matriculeDirecteur);
    @GetMapping("/etablissement/{etablissement}")
    ResponseEntity<List<AgentResponse>> getAgentsByEtablissement(@PathVariable Long etablissement);
    @GetMapping("/directions/{direction}")
    ResponseEntity<List<AgentResponse>> getAgentsByDirection(@PathVariable Long direction);
    @DeleteMapping("/{matricule}/disable")
    ResponseEntity<Object> disableAgent(@PathVariable Integer matricule);
    @GetMapping("/{id}")
    ResponseEntity<AgentResponseDto> getAgentById(@PathVariable Long id);
    @GetMapping("/chef/{id}")
    ResponseEntity<AgentResponseDto> getChefByIdAgent(@PathVariable Long id);
    @PostMapping("/cv")
    ResponseEntity<CvDto> createCv(@RequestBody CvDto cvDto);
    @GetMapping("/secteur/code/{code}")
    ResponseEntity<List<AgentDto>> getAllAgentBySecteurCode(@PathVariable String code);
    @GetMapping("/chef/equipe/secteur/code/{code}")
    ResponseEntity<List<AgentDto>> getAllChefEquipeBySecteurCode(@PathVariable String code);

}
