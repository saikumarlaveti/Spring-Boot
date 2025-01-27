package com.DataJpa.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "Family")
@NoArgsConstructor
@AllArgsConstructor
public class Books {
	@Id
	@Column(name = "Id")
	private Integer Id;

	private String Name;
	
	private Integer age;
	
	
}
