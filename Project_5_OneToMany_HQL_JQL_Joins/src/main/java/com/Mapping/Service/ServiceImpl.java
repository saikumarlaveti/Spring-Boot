package com.Mapping.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Mapping.Entity.Person;
import com.Mapping.Entity.PhoneNumber;

@Service("otp")
public class ServiceImpl implements services{

	@Autowired
	private PersonRepo per;
	
	@Autowired
	private Ph_numberRepo ph;
	@Override
	public String saveDataUsingParent(Person p) {
		
		return per.save(p).pid + "Saved successful ";
	}
//  @Override
//	public void DataLoadingUsingParent() {
//		List<Person> list = per.findAll();
//		list.forEach(per ->{
//			System.out.print("Person Info" + per);
//		});
	@Override
	public void DataLoadingUsingParent() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String deleteParentAndItsChild(int pid) {
		Optional<Person> opt = per.findById(pid);
		if(opt.isPresent()) {
			per.deleteById(pid);
			return "Delete Operation successfull";
		}
		else {
			return "User is not found";
		}
		
	}
	@Override
	public List<Object[]> getDataBy_Inner_Join() {
		return per.getDataBy_Inner_Join();
	}
	@Override
	public List<Object[]> getDataBy_Right_Join() {
		// TODO Auto-generated method stub
		return per.getDataBy_Right_Join();
	}
	@Override
	public List<Object[]> getDataBy_Left_Join() {
		// TODO Auto-generated method stub
		return per.getDataBy_Left_Join();
	}

		
		
		
	}


