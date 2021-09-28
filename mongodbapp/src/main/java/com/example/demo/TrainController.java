package com.example.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
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

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TrainController {
	
	@Autowired
	Trainrepo trainrepo;
	
	@GetMapping("/")
	public String welcome() 
	{
		return "welcome";
	}
	
	@GetMapping("/Trains")
	public List<Train> getAllTrains(){
		return trainrepo.findAll();
		
	}
	  @GetMapping("/Trains/{id}")
	  public ResponseEntity<String> getTrainById(@PathVariable("id") String id) {
		return null;
	    
	  }

	  @PostMapping("/Trains")
	  public ResponseEntity<String> add(@RequestBody Train train) {
		trainrepo.save(train);
		return null;
	    
	  }
	  
	 
	  @PutMapping("/Trains/{id}")
	  public ResponseEntity<Train> updateTrain(@PathVariable("id") int id, @RequestBody Train train) {
		  trainrepo.save(train);
		  return null;
	    
	  }

	  @DeleteMapping("/Trains/{id}")
	  public void deleteTrain(@PathVariable("id") int id) {
		trainrepo.deleteById(id);
		
		
		
	    
	  }
	   
	}

