package com.DataJpa.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Couress")
public class Courses_1 {
	
	@Id
	@Column(name="Course_Id")
	private Integer Id;
	@Column(name="Course_name")
	private String name;
	
	

}
