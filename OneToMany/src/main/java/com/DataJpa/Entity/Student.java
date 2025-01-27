package com.DataJpa.Entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Student")
public class Student {
	@Id
	@Column(name = "stdId")
	private Integer id;
	@Column(name = "Name")
	private String name;
	@Column(name = "Age")
	private Integer age;
	
	@OneToMany(targetEntity = Courses.class)
	@JoinColumn(name="courseIdFk",referencedColumnName="coursePk")
	private List<Courses> course = new ArrayList<Courses>(); //has-a

}
