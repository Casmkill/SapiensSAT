package com.test.database;

import org.hibernate.query.Query;

import com.moisat.persistence.entities.Estudiante;
import com.moisat.persistence.entities.Persona;
import com.moisat.persistence.entities.daoservice.PersonaService;
import com.moisat.persistence.entities.utils.HibernateUtils;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class PersonaTest {

	public static void main(String[] args) {
		
		PersonaService personaService = new PersonaService();
		
		List<Persona> personas = personaService.findAll();
		
		
		if(personas.size() == 0 ){
			System.out.println("LOOOOOOOOOOOOOOOOOOOOOOOL");
		}
		
	}

}
