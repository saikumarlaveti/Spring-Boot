package com.MongoCrud.Runner;

import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.MongoCrud.document.Medal;
import com.MongoCrud.document.Player;
import com.MongoCrud.document.Sport;
import com.MongoCrud.service.PlayerServices;

@Component
public class HeadRunner implements CommandLineRunner{
	@Autowired
	private PlayerServices playerservice;
@Override
public void run(String... args) throws Exception {
	
	Sport s1 = new Sport(new Random().nextInt(100),"Cricket","Ball");
	
	Medal m1 = new Medal(new Random().nextInt(101,200),"1st Prize","Kabaddi","Guravam");
	
	Player p1 = new Player(null,"Saikumar","Guravam_ village",Set.of(s1),Map.of("Medal",m1));
	
	System.out.println(playerservice.PlayerRegister(p1));
}
}
