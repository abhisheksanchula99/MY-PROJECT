package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface Trainrepo extends MongoRepository<Train, Integer>{

}
