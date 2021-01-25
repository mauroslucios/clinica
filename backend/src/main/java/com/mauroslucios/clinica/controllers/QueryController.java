package com.mauroslucios.clinica.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mauroslucios.clinica.dto.QueryDTO;
import com.mauroslucios.clinica.services.QueryService;

@RestController
@RequestMapping(value="queryes")
public class QueryController {

	@Autowired
	private QueryService service;
	
	@GetMapping
	public ResponseEntity<List<QueryDTO>> findAll(){
		List<QueryDTO> list = service.findAl();
		return ResponseEntity.ok().body(list);
	}
}

