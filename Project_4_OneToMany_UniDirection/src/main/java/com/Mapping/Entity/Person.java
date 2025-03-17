package com.Mapping.Entity;

import java.io.Serializable;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name="Person_Info")
public class Person implements Serializable{

	@Id
	@SequenceGenerator(name="Gen1",initialValue = 1000,allocationSize=1,sequenceName="PID_SEQ1")
	@GeneratedValue(generator = "Gen1",strategy=GenerationType.SEQUENCE)
	public int pid;
	
	@Column(name="pname",length=20)
	public String pname;
	
	public int age;
	
	
	
	@OneToMany(targetEntity = PhoneNumber.class,cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="Person_Id",referencedColumnName="Pid")
	public Set<PhoneNumber> phoneInfo;



	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", age=" + age + "]";
	}


	
	
	
}
