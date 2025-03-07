package com.Operations.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Family")
@Data   //setter,getter and constructors
public class Family {
	
	@Id
	@Column(name="Id")
	public int id;
	
	public String name;
	
	public int age;
	
	public int dYear;
	
	

}

