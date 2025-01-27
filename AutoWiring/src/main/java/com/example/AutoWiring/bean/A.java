package com.example.AutoWiring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("object")
public class A {
	
	B obj;
	public A () {}
	@Autowired(required=false)
	public A(B obj) {
		this.obj = obj;
	}
	public void enter() {
		obj.name();
	}
	
	

}
