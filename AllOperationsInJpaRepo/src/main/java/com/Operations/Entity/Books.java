package com.Operations.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Books")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Books {
	
	@Id
	@Column(name="Id")
	public int id;
	
	public String BookName;
	
	public String AuthorName;
	
	public int publishYear;
	
	 

}
