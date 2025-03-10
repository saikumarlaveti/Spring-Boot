package com.Operations.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;

@Component
public class AuthenticationRunner implements CommandLineRunner {
	
	@Autowired
	private EntityManager manager;
	@Override
	public void run(String... args) throws Exception {
		StoredProcedureQuery query = manager.createStoredProcedureQuery("Authentication");
		query.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2,String.class,ParameterMode.IN);
		query.registerStoredProcedureParameter(3,String.class,ParameterMode.OUT);
		
		query.setParameter(1,"Saikumar");
		query.setParameter(2, "pass1234");
		query.execute();
		
		String result = (String) query.getOutputParameterValue(3);
		System.out.println(result);
	}

}
