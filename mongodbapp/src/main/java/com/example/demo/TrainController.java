package com.example.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/AdminControls")
public class TrainController {
	Logger log=LoggerFactory.getLogger(TrainController.class);
	@Autowired
	Trainrepo trainrepo;
	@Autowired
	MongoOperations mongoOperations;
	
	
	@GetMapping("/")
	public String welcome() 
	{
		log.error("GetMapping() method executed");
		return("welcome");
	}
	
	@GetMapping("/Trains")
	public List<Train> getAllTrains(){
		log.error("GetMapping() method executed");

		return trainrepo.findAll();
		
	}
	  @GetMapping("/Trains/{id}")
	  public Optional<Train> getTrains(@PathVariable("id") int id) {
			log.error("GetMapping() method executed");

		return trainrepo.findById(id);
	    
	  }

	  @PostMapping("/Trains")
	  public ResponseEntity<String> add(@RequestBody Train train) {
		  
			log.error("PostMapping() method executed");

		trainrepo.save(train);
		return null;
	    
	  }
	  
	 
	  @PutMapping("/Trains/{id}")
	  public ResponseEntity<Train> updateTrain(@PathVariable("id") int id, @RequestBody Train train) {
		  
			log.error("PutMapping() method executed");

		  trainrepo.save(train);
		  return null;
	    
	  }

	  @DeleteMapping("/Trains/{id}")
	  public void deleteTrain(@PathVariable("id") int id) {
		  
			log.error("DeleteMapping() method executed");

		trainrepo.deleteById(id);   
	  }
	  @PostMapping("/regexfrom")
	  public List<Train> regexTrains(@RequestBody String fromm){
			log.error("PostMapping() method executed");

		  Query query = new Query();
		  query.addCriteria(Criteria.where("from").regex(fromm));
		  List<Train> trai = mongoOperations.find(query, Train.class);
		  return trai;
	  }
	  
	  
	  @PostMapping("/regexto")
	  public List<Train> regexTrain(@RequestBody String tooo){
			log.error("PostMapping() method executed");

		  Query query = new Query();
		  query.addCriteria(Criteria.where("to").regex(tooo));
		  List<Train> trai = mongoOperations.find(query, Train.class);
		  return trai;
	  }
	  
	  
	  
	  
	  
	  
	  
	   
	}

