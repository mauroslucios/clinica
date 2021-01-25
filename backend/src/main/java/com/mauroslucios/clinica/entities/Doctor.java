package com.mauroslucios.clinica.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_doctor")
public class Doctor implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String crm;
	
	@ManyToOne
	@JoinColumn(name = "specialty_id")
	private Specialty specialty;
	
	
	public Doctor() {
		
	}
	
	public Doctor(Long id, String name, String crm, Specialty specialty) {
		this.id=id;
		this.name=name;
		this.crm=crm;
		this.specialty=specialty;
	}
	
	public void setId(Long id) {
		this.id=id;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setCrm(String crm) {
		this.crm=crm;
	}
	
	public String getCrm() {
		return crm;
	}
	
	public void setSpecialty(Specialty specialty) {
		this.specialty=specialty;
	}
	
	public Specialty getSpecialty() {
		return specialty;
	}

		@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", crm=" + crm + ", specialty=" + specialty + "]";
	}
	
	
	
}
