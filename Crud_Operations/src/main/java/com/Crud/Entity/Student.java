package com.Crud.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {
	
	@Id
	@Column(name="Id")
	private Integer id;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Age")
	private Integer Age;
	
	public Student() {
		super();
	}
	
	

	public Student(Integer id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.Age = age;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return Age;
	}

	public void setAge(Integer age) {
		this.Age = age;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Age=" + Age + "]";
	}
	
	

}
