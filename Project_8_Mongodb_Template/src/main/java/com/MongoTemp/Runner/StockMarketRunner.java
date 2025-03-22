package com.MongoTemp.Runner;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.MongoTemp.document.StockDetails;
import com.MongoTemp.document.service.StockService;
import com.MongoTemp.document.service.StockServiceImpl;

@Component
public class StockMarketRunner implements CommandLineRunner {
	
	@Autowired
	private StockServiceImpl service;

	@Override
	public void run(String... args) throws Exception {
//		StockDetails stock1 = new StockDetails(new Random().nextInt(1000),"TATA Stock",5000,"TCS");
//		
//		System.out.println(service.registerStock(stock1));
//		
//		StockDetails stock2 = new StockDetails(new Random().nextInt(1000),"BATA Stock",6000,"BTX");
//		StockDetails stock3 = new StockDetails(new Random().nextInt(1000),"CATA Stock",7000,"Logo");
//		StockDetails stock4 = new StockDetails(new Random().nextInt(1000),"DATA Stock",8000,"Sai");
//		System.out.println(service.registerStockWithList(List.of(stock2,stock3,stock4)));
		
//		service.fetchStockDetailsByStockName("TATA Stock").forEach(System.out::println);
//		System.out.println("fetch By price : ");
//		service.fetchStockDetailsByPrice(5000, 6000).forEach(System.out::println);
		
		System.out.println(service.fetchStockDetailsByUsing(68));
		
		System.out.println(service.fetchAndUpdateStockDetails(68, "Saikumar", 10000));
		System.out.println(service.fetchStockDetailsByUsing(68));

	}

}
