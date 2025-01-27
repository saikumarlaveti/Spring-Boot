package com.DataJpa.Entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Studentds")
public class Student_1 {

	@Id
	@Column(name="Std_Id")
	private Integer Id;
	
	@Column(name="Name")
	private String name;
	
	
	@ManyToMany
	@JoinTable(name="Std_CouTab",
	joinColumns = @JoinColumn(name="StudenFK"),
	inverseJoinColumns = @JoinColumn(name="CourseFk"))
	private List<Courses_1> list;
}
