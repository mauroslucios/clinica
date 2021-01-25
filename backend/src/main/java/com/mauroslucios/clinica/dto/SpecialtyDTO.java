package com.mauroslucios.clinica.dto;

import java.io.Serializable;

import com.mauroslucios.clinica.entities.Specialty;

public class SpecialtyDTO implements Serializable{
	
	public static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	
	public SpecialtyDTO() {
		
	}

	public SpecialtyDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public SpecialtyDTO(Specialty entity) {
		id = entity.getId();
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

	
}
