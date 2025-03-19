package com.MongoCrud.document;

import java.util.Map;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Person {

	@Id
	@NonNull
	public String id;
	
	@NonNull
	public String name;
	
	@NonNull
	public int age;
	
	@NonNull
	public String course;
	
	
	public DrivingLicence licenceDetails;
	
	
	
}
