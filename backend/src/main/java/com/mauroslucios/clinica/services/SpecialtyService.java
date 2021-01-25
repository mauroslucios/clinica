package com.mauroslucios.clinica.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mauroslucios.clinica.dto.SpecialtyDTO;
import com.mauroslucios.clinica.entities.Specialty;
import com.mauroslucios.clinica.repositories.SpecialtyRepository;

@Service
public class SpecialtyService {
	
	@Autowired
	private SpecialtyRepository specialtyRepository;
	
	@Transactional(readOnly=true)
	public List<SpecialtyDTO> findAll(){
		List<Specialty> list = specialtyRepository.findAll();
		return list.stream().map(x -> new SpecialtyDTO(x)).collect(Collectors.toList());
	}

}

