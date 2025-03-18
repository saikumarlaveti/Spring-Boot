package com.MongoCrud.document;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {
	
	@Id
	private String id; //fixed name
	
	private String name;
	
	private int age;
	
	private String address;
	
	private boolean isMarried;
	

}
