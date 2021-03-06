package com.mauroslucios.clinica.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mauroslucios.clinica.dto.DoctorDTO;
import com.mauroslucios.clinica.services.DoctorService;

@RestController
@RequestMapping(value ="/doctors")
public class DoctorController {

	@Autowired
	private DoctorService service;
	
	@GetMapping
	public ResponseEntity<List<DoctorDTO>> findAll(){
		List<DoctorDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
