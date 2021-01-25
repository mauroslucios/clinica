package com.mauroslucios.clinica.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mauroslucios.clinica.dto.PatientDTO;
import com.mauroslucios.clinica.entities.Patient;
import com.mauroslucios.clinica.repositories.PatientRepository;

@Service
public class PatientService {

	@Autowired
	private PatientRepository patientRpository;
	
	@Transactional(readOnly= true)
	public List<PatientDTO> findAll(){
		List<Patient> list = patientRpository.findAll();
		return list.stream().map(x -> new PatientDTO(x)).collect(Collectors.toList());
	}
}




