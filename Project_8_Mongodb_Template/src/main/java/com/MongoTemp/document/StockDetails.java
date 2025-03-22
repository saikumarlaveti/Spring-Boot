package com.MongoTemp.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Document
@AllArgsConstructor
@NoArgsConstructor
public class StockDetails {
	
	@Id
	private Integer stockId;
	
	private String stockName;
	
	private double price;
	
	private String exchangeName;

	@Override
	public String toString() {
		return "StockDetails [stockId=" + stockId + ", stockName=" + stockName + ", price=" + price + ", exchangeName="
				+ exchangeName + "]";
	}
	
	
	
	

}
