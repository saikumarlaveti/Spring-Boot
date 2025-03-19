package com.MongoCrud.document;

import java.util.Map;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person {

	@Id
	public String id;
	
	public String name;
	
	public String[] favNames;
	
	public Set<Long> numbers;
	
	public Map<Integer,String> familyNames;
	
	
	
	
}
