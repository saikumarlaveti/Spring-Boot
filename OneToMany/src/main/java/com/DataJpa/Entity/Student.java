package com.DataJpa.Entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Student")
@Setter
@Getter
public class Student implements Serializable {

	@Id
	public int id;
	
	@Column(length=20)
	public String name;
	
	@OneToMany(targetEntity=Courses.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="Student_Id",referencedColumnName = "id")
	public List<Courses> Courses;
}
