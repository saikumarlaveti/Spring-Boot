package com.Crud.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Crud.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {
	
	@Query("from Student where id>=?1 and id<=?2")
	public List<Student> SearchStudentsByRange(int start, int end);
	
	@Query("from Student where name In(:name1,:name2,:name3) order by name asc")
	public List<Student> SearchStudentByNames(String name1, String name2 , String name3);

	@Query("select name,age from Student where name In(:name1,:name2,:name3) and age >= :ages")
	public List<Object[]> SearchStudentByNameAndAge(String name1,String name2,String name3,int ages);
	
	
	@Query("select name from Student where id >= :start and id <= :end")
	public List<String> SearchByNames(int start , int end);  

	
	@Query("from Student where id <= :id")
	public List<Student> searchById(int id);
}

