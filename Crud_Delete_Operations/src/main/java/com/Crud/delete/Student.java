package com.Crud.delete;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Details")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {
	
	@Id
	@Column(name="Id")
	private Integer id;
	
	private String name;
	
	private Integer Dob;
	
	private String email;
	
	private String Course;
	
	
	
}
