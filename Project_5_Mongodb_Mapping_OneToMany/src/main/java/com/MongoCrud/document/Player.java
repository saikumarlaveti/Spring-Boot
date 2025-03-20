package com.MongoCrud.document;

import java.util.Map;
import java.util.Set;

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
public class Player {
	
	@Id
	private String pid;
	
	private String pname;
	
	private String paddress;
	
	private Set<Sport> sports;
	
	private Map<String,Medal> medal;
}
