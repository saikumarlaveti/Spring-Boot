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
public class Sport {
	
	@Id
	private int sid;
	
	private String sname;
	
	private String kitItems;

	@Override
	public String toString() {
		return "Sport [sid=" + sid + ", sname=" + sname + ", kitItems=" + kitItems + "]";
	}
	
	
}
