package com.Operations.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;

@Component
public class Runner implements CommandLineRunner{

	@Autowired
	public EntityManager manager;
	@Override
	public void run(String... args) throws Exception {
		 StoredProcedureQuery query = manager.createStoredProcedureQuery("getFamilyName");

	        // Register IN and OUT Parameters
	        query.registerStoredProcedureParameter(1, Integer.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter(2, String.class, ParameterMode.OUT);

	        // Set IN Parameter
	        query.setParameter(1, 2);

	        // Execute the Procedure
	        query.execute();

	        // Get OUT Parameter
	        String familyName = (String) query.getOutputParameterValue(2);
	        System.out.println("Family Name: " + familyName);
		
	}

}
