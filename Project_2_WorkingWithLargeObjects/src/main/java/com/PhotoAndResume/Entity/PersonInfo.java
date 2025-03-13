package com.PhotoAndResume.Entity;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonInfo {

	@Id
	private Integer pid;
	
	private String pname;
	
	private boolean ismarried;
	
	@Lob
	private byte[] photo;
	
	@Lob
	private char[] resume;
}
