package com.sai.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sai.AppConfig.App;
import com.sai.bean.Details;

public class AppConfig {
	public static void main(String[] args) {
		ApplicationContext con = new AnnotationConfigApplicationContext(App.class);
		Details d = con.getBean("Info",Details.class);
		System.out.println(d);
	}
}
