package com.example.booking;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins="*")
@RequestMapping("/book")
public class bookingcontroller {
	Logger log=LoggerFactory.getLogger(bookingcontroller.class);
	
	@Autowired 
	private bookingrepository bookrepository;

	@PostMapping("/orders/addOrder")
	public String saveBook(@RequestBody bookingorder book) {
		log.error("PostMapping() method executed");

	bookrepository.save(book);
	return book.getId();
    }
	@GetMapping("/")
	public String Check(){
		log.error("GetMapping() method executed");

		return("tested");
	}
	@GetMapping("/orders")
	public List<bookingorder> getAllTrains(){
		log.error("GetMapping() method executed");

		return bookrepository.findAll();
	}
	
	@GetMapping("/orders/{id}")
	public Optional<bookingorder> getBook(@PathVariable String id){
		log.error("GetMapping() method executed");

		return bookrepository.findById(id);
	}
	@PutMapping("/orders/update/{id}")
	public bookingorder updateOrder(@PathVariable("id") String id,@RequestBody bookingorder order ) {
		
		log.error("PutMapping() method executed");

		order.setId(id);
		bookrepository.save(order);
		return order;
	}
		
	 @DeleteMapping("/orders/delete/{id}")
	 public String deleteOrder (@PathVariable String id) {
			log.error("DeleteMapping() method executed");

	  bookrepository.deleteById(id);
		return null;
		}
	}
