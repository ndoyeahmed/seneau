package com.seneau.agentservice.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DirectionDto  {
    private Long id;
    private boolean active = true;
    private String name;
    private String code;
}