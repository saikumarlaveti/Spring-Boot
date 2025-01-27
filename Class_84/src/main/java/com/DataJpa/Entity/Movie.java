package com.DataJpa.Entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="Movie")
@Data
public class Movie implements Serializable {
	
	@Id
	@Column(name="Id")
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	
	@Column(name = "MovieName")
	private String MovieName;


}
