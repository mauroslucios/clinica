package com.mauroslucios.clinica.dto;

import java.io.Serializable;
import java.time.Instant;

import com.mauroslucios.clinica.entities.Doctor;
import com.mauroslucios.clinica.entities.Patient;
import com.mauroslucios.clinica.entities.Query;
import com.mauroslucios.clinica.entities.QueryStatus;

public class QueryDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Instant moment;
	private QueryStatus status;	
	private Doctor doctor;
	private Patient patient; 

	public QueryDTO() {
		
	}
	
	

	public QueryDTO(Long id, Instant moment, QueryStatus status, Doctor doctor, Patient patient) {
		this.id = id;
		this.moment = moment;
		this.status = status;
		this.doctor = doctor;
		this.patient = patient;
	}
	
	public QueryDTO(Query entity) {
		id = entity.getId();
		moment = entity.getMoment();
		status = entity.getStatus();
		doctor = entity.getDoctors();
		patient = entity.getPatient();
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public QueryStatus getStatus() {
		return status;
	}

	public void setStatus(QueryStatus status) {
		this.status = status;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
