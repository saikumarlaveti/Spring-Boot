package com.sai.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Info")
public class Details {
	@Value("${my.name}")
	String name;
	@Value("${password}")
	int password;
	@Value("${gender}")
	String gender;

	@Override
	public String toString() {
		return "Details [name=" + name + ", password=" + password + ", gender=" + gender + "]";
	}
}
