package com.mauroslucios.clinica.dto;

import java.io.Serializable;
import java.util.Date;

import com.mauroslucios.clinica.entities.Patient;

public class PatientDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private String name;
	private String cpf;
	private Date birth;
	
	public PatientDTO() {
		
	}

	public PatientDTO(Long id, String name, String cpf, Date birth) {
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.birth = birth;
	}
	
	public PatientDTO(Patient entity) {
		id = entity.getId();
		name = entity.getName();
		cpf = entity.getCpf();
		birth = entity.getBirth();
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

	
}
