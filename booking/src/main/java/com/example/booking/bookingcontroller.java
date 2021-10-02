package com.example.booking;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin("http://localhost:4200")
public class bookingcontroller {
	
	@Autowired 
	private bookingrepository bookrepository;

	@PostMapping("/orders/addOrder")
	public String saveBook(@RequestBody bookingorder book) {
	bookrepository.save(book);
	return book.getId();
    }
	@GetMapping("/")
	public String Check(){
		return("tested");
	}
	@GetMapping("/orders")
	public List<bookingorder> getAllTrains(){
		return bookrepository.findAll();
	}
	
	@GetMapping("/orders/{id}")
	public Optional<bookingorder> getBook(@PathVariable String id){
		return bookrepository.findById(id);
	}
	@PutMapping("/orders/update/{id}")
	public bookingorder updateOrder(@PathVariable("id") String id,@RequestBody bookingorder order ) {
		order.setId(id);
		bookrepository.save(order);
		return order;
	}
		
	 @DeleteMapping("/orders/delete/{id}")
	 public String deleteOrder (@PathVariable String id) {
	  bookrepository.deleteById(id);
		return null;
		}
	}
