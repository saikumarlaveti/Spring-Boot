package com.Operations.Runner; 

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import jakarta.persistence.EntityManager;

@Component
public class FunctionRunner implements CommandLineRunner {

    @Autowired
    private EntityManager manager;

    @Override
    public void run(String... args) throws Exception {
        Session session = manager.unwrap(Session.class);
        
        Integer startYear = 2000;
        Integer endYear = 2002;
        
        Integer bookCount = session.doReturningWork(connection -> {
            try (CallableStatement cs = connection.prepareCall("{? = CALL Book_Details(?, ?)}")) {
                cs.registerOutParameter(1, Types.INTEGER); // Output parameter
                cs.setInt(2, startYear); // Input parameter 1
                cs.setInt(3, endYear); // Input parameter 2
                
                cs.execute();
                
                return cs.getInt(1); // Get the function return value
            }
        });
        
        System.out.println("Total books published between " + startYear + " and " + endYear + ": " + bookCount);
    }
}
