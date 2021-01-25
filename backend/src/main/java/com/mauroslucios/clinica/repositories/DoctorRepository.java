package com.mauroslucios.clinica.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mauroslucios.clinica.entities.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

	public List<Doctor> findAllByOrderByNameAsc();
	
}
