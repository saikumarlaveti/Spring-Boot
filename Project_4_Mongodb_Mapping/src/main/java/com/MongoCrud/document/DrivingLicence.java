package com.MongoCrud.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DrivingLicence {
	
	@Id
	@NonNull
	private String id;
	
	@NonNull
	private Long DrNo;
	
	@NonNull
	private String type;
	
	private Person personDetails;
	

}
