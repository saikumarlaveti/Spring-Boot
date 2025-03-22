package com.MongoTemp.document.service;

import java.util.List;

import com.MongoTemp.document.StockDetails;

public interface StockService {
	
	public String registerStock(StockDetails details);
	
	public String registerStockWithList(List<StockDetails> details);
	
	public List<StockDetails> fetchStockDetailsByStockName(String name);
	
	public List<StockDetails> fetchStockDetailsByPrice(double startPrice,double endPrice);
	
	public StockDetails fetchStockDetailsByUsing(int id);
	
	public String fetchAndUpdateStockDetails(int id,String stockName,double price);
	
}
