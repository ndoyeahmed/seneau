package com.seneau.agentservice.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SecteurDto implements Serializable {
    private Long id;
    private boolean active = true;
    private String name;
    private String code;
}
