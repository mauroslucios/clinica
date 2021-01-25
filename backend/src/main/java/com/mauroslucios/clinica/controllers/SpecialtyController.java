package com.mauroslucios.clinica.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mauroslucios.clinica.dto.SpecialtyDTO;
import com.mauroslucios.clinica.services.SpecialtyService;

@RestController
@RequestMapping(value="/specialtyes")
public class SpecialtyController {
	
	@Autowired
	private SpecialtyService service;

	@GetMapping
	public ResponseEntity<List<SpecialtyDTO>> findAll(){
		List<SpecialtyDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
