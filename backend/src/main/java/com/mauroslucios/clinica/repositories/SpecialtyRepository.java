package com.mauroslucios.clinica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mauroslucios.clinica.entities.Specialty;

public interface SpecialtyRepository extends JpaRepository<Specialty, Long> {

}
