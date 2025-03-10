package com.Operations.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "userlist")
@Data

public class userlist {

	@Id
	@Column(name = "username")
	public String username ;
	
	public String password;
	
	
}
