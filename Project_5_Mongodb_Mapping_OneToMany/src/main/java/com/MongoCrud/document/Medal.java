package com.MongoCrud.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Medal {
	
	@Id
	private int mid;
	
	private String mname;
	
	private String event;
	
	private String place;
}
