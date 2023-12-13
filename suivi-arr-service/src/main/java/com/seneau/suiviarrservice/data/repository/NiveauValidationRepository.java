package com.seneau.suiviarrservice.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NiveauValidationRepository extends JpaRepository<NiveauValidation, Long> {
    NiveauValidation findByOrdreAndTypeDemande(long ordre, TypeDemande typeDemande);
}
