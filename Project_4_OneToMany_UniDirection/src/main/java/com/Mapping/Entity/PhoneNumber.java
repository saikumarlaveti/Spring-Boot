package com.Mapping.Entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Ph_Number")
@Setter
@Getter
public class PhoneNumber implements Serializable{
	
	@Id
	@GeneratedValue
	public int regId;
	
	@Column(length=20)
	public Long phoneNumber;
	
	@Column(length=20)
	public String provider;

}
