package com.Crud.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.Crud.Repo.StudentRepo;
import com.Crud.view.ResultView;

@Component
public class Runner implements CommandLineRunner {

	@Autowired
	public StudentRepo std;
	
	@Override
	public void run(String... args) throws Exception {	
		Iterable<ResultView> it = std.findByIdGreaterThanEqualAndIdLessThanEqual(2, 4);
		
		it.forEach(item-> System.out.println(item.getId() + " " + item.getName() ));
	}

}
