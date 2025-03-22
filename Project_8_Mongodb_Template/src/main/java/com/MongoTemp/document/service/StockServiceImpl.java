package com.MongoTemp.document.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Service;

import com.MongoTemp.document.StockDetails;

@Service("StockService")
public class StockServiceImpl implements StockService{

	@Autowired
	private MongoTemplate template;
	@Override
	public String registerStock(StockDetails details) {
		return template.save(details).getStockId()+" Successfully Registered";
	}
	@Override
	public String registerStockWithList(List<StockDetails> details) {
		
		int size = template.insertAll(details).size();
		return size + " Records are Saved ";
	}
	@Override
	public List<StockDetails> fetchStockDetailsByStockName(String name) {
		Query query = new Query();
		query.addCriteria(Criteria.where("stockName").is(name));
		 List<StockDetails> list = template.find(query, StockDetails.class);
		return list; 
	}
	@Override
	public List<StockDetails> fetchStockDetailsByPrice(double startPrice, double endPrice) {
		Query query = new Query();
		query.addCriteria(Criteria.where("price").gte(5000.0).lte(6000));
		List<StockDetails> list_1 = template.find(query, StockDetails.class);
		return list_1;
	}
	@Override
	public StockDetails fetchStockDetailsByUsing(int id) {
		// TODO Auto-generated method stub
		return template.findById(id, StockDetails.class);
	}
	@Override
	public String fetchAndUpdateStockDetails(int id, String Name, double nprice) {
		Query query = new Query();
		query.addCriteria(Criteria.where("stockId").is(id));
		Update update =new Update();
		update.set("stockName", Name);
		update.set("price", nprice);
		StockDetails details= template.findAndModify(query, update, StockDetails.class);
		return details == null ?"stock not found" : "stock updated successfully";
	}
	
}
