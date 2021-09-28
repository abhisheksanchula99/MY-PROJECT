package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongodbappApplication implements CommandLineRunner {

	@Autowired
	private Trainrepo trainrepo;
	
	public static void main(String[] args) {
		SpringApplication.run(MongodbappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		Train c1 = new Train(1,"rajdhani1","hyd1","vizag1",100);
		Train c2 = new Train(2,"rajdhani2","hyd2","vizag2",100);
		Train c3 = new Train(3,"rajdhani3","hyd3","vizag3",100);
		Train c4 = new Train(4,"rajdhani4","hyd4","vizag4",100);
		
		trainrepo.save(c1);
		trainrepo.save(c2);
		trainrepo.save(c3);
		trainrepo.save(c4);
	
		List<Train> trains = trainrepo.findAll();
		
		for(Train c : trains)
		{
			System.out.println(c.toString());
		}
	}

}
