package com.seneau.suiviarrservice.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface DemandeCongeRepository extends JpaRepository<DemandeConge,Long> {
}
