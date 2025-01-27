package com.DataJpaex.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Student")
@Entity
public class Student {
	@Id
	@Column(name="Id")
	Integer id;
	String name;
	Integer age;
}
