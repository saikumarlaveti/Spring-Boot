package com.Annotaions;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("saiObject")
public class Saikumar {
	
	@Value("Saikumar")
	private String name;
	
	@Value("40")
	private int id;

	@Override
	public String toString() {
		return " [name=" + name + ", id=" + id + "]";
	}

	
}
