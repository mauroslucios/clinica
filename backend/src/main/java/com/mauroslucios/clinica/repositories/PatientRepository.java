package com.mauroslucios.clinica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mauroslucios.clinica.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}
