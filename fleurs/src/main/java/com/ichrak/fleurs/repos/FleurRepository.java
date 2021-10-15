package com.ichrak.fleurs.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ichrak.fleurs.entities.Fleur;

public interface FleurRepository extends JpaRepository<Fleur, Long> {
}


