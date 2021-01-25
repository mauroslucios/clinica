package com.mauroslucios.clinica.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mauroslucios.clinica.dto.PatientDTO;
import com.mauroslucios.clinica.services.PatientService;

@RestController
@RequestMapping(value="/patients")
public class PatientController {

	@Autowired
	private PatientService service;
	
	@GetMapping
	public ResponseEntity<List<PatientDTO>> findAll(){
		List<PatientDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}
