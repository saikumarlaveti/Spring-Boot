package com.MongoCrud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MongoCrud.document.Player;
import com.MongoCrud.repo.PlayerRepo;

@Service("PlayerServices")
public class PlayerServicesImpl implements PlayerServices{
	
	
	@Autowired
	private PlayerRepo person;
	
	@Override
	public String PlayerRegister(Player p) {
	
		return person.save(p).getPid()+" : Player Successfully Registered";
	}


}
