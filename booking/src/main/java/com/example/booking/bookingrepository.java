package com.example.booking;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface bookingrepository extends MongoRepository<bookingorder, String> {

}
