package com.DataJpa.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.DataJpa.Entity.Product;
import com.DataJpa.Repo.ProductRepo;

@Component
public class Test implements CommandLineRunner {

	@Autowired
	private ProductRepo repo;
	@Override
	public void run(String... args) throws Exception {
		
		Set<String> vendors = new HashSet<>();
		vendors.add("B1");
		vendors.add("B2");
		vendors.add("B3");
		
		List<String> versions = new ArrayList<>();
		versions.add("V1");
		versions.add("V2");
		versions.add("V3");
		
		Map<String,String> clients =new HashMap<>();
		clients.put("C1", "ABC");
		clients.put("C2", "MNO");
		clients.put("C3", "XYZ");
		
		repo.save(new Product(10,"P1",vendors,versions,clients));
		
		
	}
	

}
