package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.*;
import com.example.demo.service.UserService;
import com.example.demo.utils.JwtUtils;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/Adlog")
public class AuthController {
	Logger log=LoggerFactory.getLogger(AuthController.class);

	
	
	@Autowired
	UserRepository userrepo;
	
	@Autowired
	AuthenticationManager authenticates;
	
	@Autowired
	UserService userservice;
	
	@Autowired
	JwtUtils jwtutil;
	
	@PostMapping("/subs")
	private ResponseEntity<AuthenticationResponse>subscribeClient(@RequestBody AuthenticationRequest authreq){
		
		log.error("PostMapping() method executed");

		UserModel usermodel =new UserModel();
		
		usermodel.setUsername(authreq.getUsername());
		usermodel.setPassword(authreq.getPassword());
		
		
		try {
			userrepo.save(usermodel);
		}
		catch(Exception e){
			return new ResponseEntity<AuthenticationResponse>(new AuthenticationResponse
					("Error during subscription ") , HttpStatus.OK);
		}
		
		return new ResponseEntity<AuthenticationResponse>(new AuthenticationResponse
				("Successful subs for client " +authreq.getUsername()), HttpStatus.OK);
	}
	
	
	@PostMapping("/auth")
	private ResponseEntity<?> authenticateClient(@RequestBody AuthenticationRequest authreq){
		log.error("PostMapping() method executed");

		String username=authreq.getUsername();
		String password= authreq.getPassword();
		try {
			authenticates.authenticate(new UsernamePasswordAuthenticationToken(username, password));
				
		}
		catch(Exception e) {
			return ResponseEntity.ok(new AuthenticationResponse("no"));
		}
		
		UserDetails userdetails= userservice.loadUserByUsername(username);
		
		String jwt = jwtutil.generateToken(userdetails);
		
		return ResponseEntity.ok(new AuthenticationResponse(jwt));
	}
	
}
