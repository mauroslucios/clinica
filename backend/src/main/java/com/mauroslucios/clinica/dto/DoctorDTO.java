package com.mauroslucios.clinica.dto;

import java.io.Serializable;

import com.mauroslucios.clinica.entities.Doctor;
import com.mauroslucios.clinica.entities.Specialty;

public class DoctorDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String crm;
	private Specialty specialty;
	
	public DoctorDTO() {
		
	}

	public DoctorDTO(Long id, String name, String crm, Specialty specialty) {
		this.id = id;
		this.name = name;
		this.crm = crm;
		this.specialty = specialty;
	}
	
	public DoctorDTO(Doctor entity) {
		id        = entity.getId();
		name      = entity.getName();
		crm       = entity.getCrm();
		specialty = entity.getSpecialty();
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

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public Specialty getSpecialty() {
		return specialty;
	}

	public void setSpecialty(Specialty specialty) {
		this.specialty = specialty;
	}
	
	
	
	
}
