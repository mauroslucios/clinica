package com.mauroslucios.clinica.entities;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_query")
public class Query implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Instant moment;
	private QueryStatus status;
	
		
	@OneToOne
	@JoinColumn(name = "doctor_id")
	private Doctor doctor;
	
	
	@OneToOne
	@JoinColumn(name = "patient_id")
	private Patient patient; 
	
	
	
	public Query() {
		
	}
	
	public Query(Long id, Instant moment, QueryStatus status) {
		this.id     = id;
		this.moment = moment;
		this.status = status;
	}
	
	public void setId(Long id) {
		this.id=id;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setMoment(Instant moment) {
		this.moment = moment;
	}
	
	public Instant getMoment() {
		return moment;
	}
	
	public void setStatus(QueryStatus status) {
		this.status = status;
	}
	
	public QueryStatus getStatus() {
		return status;
	}
	
	
		
	public Doctor getDoctors() {
		return doctor;
	}

	public Patient getPatient() {
		return patient;
	}

	public String toString() {
		return "QueryStatus [id= "+ id + "moment =" + moment + "status= "+ status+" ]";
	}
	
}


