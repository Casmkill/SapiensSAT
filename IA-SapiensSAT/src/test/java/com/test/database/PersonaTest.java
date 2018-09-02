package com.test.database;


import com.moisat.persistence.entities.CarreraEstudiante;

import com.moisat.persistence.entities.daoservice.CarreraEstudianteService;


import java.util.List;


public class PersonaTest {

	public static void main(String[] args) {
		
	CarreraEstudianteService personaService = new CarreraEstudianteService();
		
		List<CarreraEstudiante> personas = personaService.findAll();
		
		
		if(personas.size() == 0 ){
			System.out.println("LOOOOOOOOOOOOOOOOOOOOOOOL");
		}
		
	}

}
