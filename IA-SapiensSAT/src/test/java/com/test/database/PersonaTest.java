package com.test.database;



import org.hibernate.query.Query;

import com.moisat.persistence.entities.Estudiante;
import com.moisat.persistence.entities.utils.HibernateUtils;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class PersonaTest {

	   public static void main(String[] args) {
	        SessionFactory factory = (SessionFactory) HibernateUtils.getSessionFactory();
	 
	        Session session = ((org.hibernate.SessionFactory) factory).getCurrentSession();
	 
	        try {
	 
	            // All the action with DB via Hibernate
	            // must be located in one transaction
	            // Start Transaction.                
	            session.getTransaction().begin();
	             
	            // Create an HQL statement, query the object.
	            // HQL with parameters.            
	            // Equivalent to the SQL statement:
	            // Select e.* from EMPLOYEE e cross join DEPARTMENT d
	            // where e.DEPT_ID = d.DEPT_ID and d.DEPT_NO = :deptNo;        
	            String sql = "Select e from " + Estudiante.class.getName() + " e ";
	  
	            // Create query object.
	            Query<Estudiante> query = session.createQuery(sql);
	 
	            
	            
	      
	 
	  
	            // Execute query.
	            List<Estudiante> employees = query.getResultList();
	            
	            if(employees.isEmpty()){
	            	System.out.println("LOOOOOOOOOOOOOOOOOOOL");
	            }
	 
	            for (Estudiante emp : employees ) {
	                System.out.println("Emp");
	            }
	  
	            // Commit data
	            session.getTransaction().commit();
	        } catch (Exception e) {
	            e.printStackTrace();
	            // Rollback in case of an error occurred.
	            session.getTransaction().rollback();
	        }
	    }

}
