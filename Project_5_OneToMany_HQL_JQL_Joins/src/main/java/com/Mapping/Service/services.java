package com.Mapping.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Mapping.Entity.Person;


public interface services {
	public String saveDataUsingParent(Person p);
	
	public void DataLoadingUsingParent();
	
	public String deleteParentAndItsChild(int pid);
	
	public List<Object[]> getDataBy_Inner_Join();
	
	public List<Object[]> getDataBy_Right_Join();
	
	public List<Object[]> getDataBy_Left_Join();
	
	
}
