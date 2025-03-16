package com.DataJpa.Entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Courses")
@Setter
@Getter
public class Courses implements Serializable{
	
	@Id
	public int c_Id;
	
	@Column(length=20)
	public String Subjects;
	
	
	
	

}
