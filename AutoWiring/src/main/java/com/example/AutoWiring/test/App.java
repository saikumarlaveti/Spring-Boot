package com.example.AutoWiring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.AutoWiring.AppConfig.AppConfig;
import com.example.AutoWiring.bean.A;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext con = new AnnotationConfigApplicationContext(AppConfig.class);
    	A a = con.getBean("object",A.class);
    	a.enter();
    	
    }
}
