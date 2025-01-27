package com.DataJpa.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "courses")
public class Courses {
	@Id
	@Column(name = "CourseId")
	private Integer courserId;
	@Column(name = "CourseName")
	private String courserName;

}
