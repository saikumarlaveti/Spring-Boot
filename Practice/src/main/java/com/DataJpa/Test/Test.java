package com.DataJpa.Test;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.DataJpa.Entity.Men;
import com.DataJpa.Entity.Women;
import com.DataJpa.Repo.MenRepo;
import com.DataJpa.Repo.WomenRepo;


@Component
public class Test implements CommandLineRunner
{
	@Autowired
	private MenRepo stdRepo;
	
	@Autowired
	private WomenRepo coRepo;

	@Override
	public void run(String... args) throws Exception {
		Women w1 = new Women(1,"Girl");
		//Women w2 = new Women(2,"Baby");
		coRepo.save(w1);
		//coRepo.save(w2);
		
		Men m1 = new Men(40,"Saikumar Laveti",532127,Arrays.asList(w1));
		//Men m2 = new Men(29,"Lokesh Karri",520080,Arrays.asList(w2));
		//Men m3 = new Men(29,"Lokesh Karri",520080);

		stdRepo.save(m1);
		//stdRepo.save(m2);
		
		
		
	}

}
