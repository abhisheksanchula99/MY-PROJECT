package com.example.booking;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest 
public class smokeTest {
	
	@Autowired
	private bookingcontroller controller;
	
	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

}
