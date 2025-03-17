package com.Mapping.Service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Mapping.Entity.Person;

public interface PersonRepo extends JpaRepository<Person, Integer> {
	
	
	@Query("select p.pid, p.pname, ph.provider, ph.regId from Person p inner join p.phoneInfo ph")
	public List<Object[]> getDataBy_Inner_Join();

	@Query("select p.pid, p.pname, ph.provider, ph.regId from Person p right join p.phoneInfo ph")
	public List<Object[]> getDataBy_Right_Join();
	
	@Query("select p.pid, p.pname, ph.provider, ph.regId from Person p left join p.phoneInfo ph")
	public List<Object[]> getDataBy_Left_Join();
	

}
