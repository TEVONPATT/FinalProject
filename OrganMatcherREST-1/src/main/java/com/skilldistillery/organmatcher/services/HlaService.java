package com.skilldistillery.organmatcher.services;

import java.util.List;

import com.skilldistillery.organmatcher.entities.Hla;

public interface HlaService {

	List<Hla> listAll();

	Hla show(int id);

	Hla create( Hla hla, int patientId );
	
	List<Hla> createList( List<Hla> hlaList , int patientId );

	Hla update(Hla hla, int id);

	boolean destroy(int id);

}
