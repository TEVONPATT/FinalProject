package com.skilldistillery.organmatcher.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Hla {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "protein_class")
	private String proteinClass;
	
	private int allele;
	
	@ManyToOne
	@JoinColumn(name="patient_id")
	private Patient patient;

	public Hla() {
		super();
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProteinClass() {
		return proteinClass;
	}

	public void setProteinClass(String proteinClass) {
		this.proteinClass = proteinClass;
	}

	public int getAllele() {
		return allele;
	}

	public void setAllele(int allele) {
		this.allele = allele;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	@Override
	public String toString() {
		return "Hla [id=" + id + ", proteinClass=" + proteinClass + ", allele=" + allele + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hla other = (Hla) obj;
		if (id != other.id)
			return false;
		return true;
	}

	
	
}
