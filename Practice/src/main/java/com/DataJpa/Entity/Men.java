package com.DataJpa.Entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Men {
	
	@Id
	@Column(name = "Id")
	private Integer Id;
	
	private String name;
	
	private Integer Pincode;
	
	@OneToOne
	@JoinColumn(name = "courseDetails")
	private List<Women> list;

}
