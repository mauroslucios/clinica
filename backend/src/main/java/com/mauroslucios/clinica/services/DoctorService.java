package com.mauroslucios.clinica.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mauroslucios.clinica.dto.DoctorDTO;
import com.mauroslucios.clinica.entities.Doctor;
import com.mauroslucios.clinica.repositories.DoctorRepository;

@Service
public class DoctorService {
	
	@Autowired
	private DoctorRepository doctorRepository;

	@Transactional(readOnly = true)
	public List<DoctorDTO> findAll(){
		List<Doctor> list = doctorRepository.findAllByOrderByNameAsc();
		return list.stream().map(x -> new DoctorDTO (x)).collect(Collectors.toList());
	}
}
