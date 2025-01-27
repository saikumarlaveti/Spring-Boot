package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.Config.AppConfig;
import com.demo.bean.Teacher;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	Teacher teacher = context.getBean("obj",Teacher.class);
    	teacher.attendence();
    	System.out.println(teacher.toString());
    }
}
