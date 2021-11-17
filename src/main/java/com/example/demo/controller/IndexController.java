package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

public class IndexController {
	
	@Autowired
	private Saludo saludo;


	@GetMapping("/saludo")
	public ResponseEntity<String> saludo() {
		
		return new ResponseEntity<String>(HttpStatus.OK).ok(saludo.mensajeSaludo());
	}

}
