package com.hsbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/v2")
public class MicroserviceTwoRest {

	@Autowired
	private RestTemplate rest;
	
	@GetMapping
	public ResponseEntity<Object> greet() {
		String url = "http://MS-ONE/v1";
		String result = rest.getForObject(url, String.class);
		String message = "Hello I am Micoservice Two "+result;
		return ResponseEntity.status(200).body(message);
	}
}
