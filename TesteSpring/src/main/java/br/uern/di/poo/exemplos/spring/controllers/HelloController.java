package br.uern.di.poo.exemplos.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.uern.di.poo.exemplos.spring.services.HelloService;

@RestController
@RequestMapping(value = "/hello")
public class HelloController {

	@Autowired
	private HelloService helloService;
	
	@GetMapping
	@RequestMapping(value = "/en")
	public ResponseEntity sayHello() {
		String hello = helloService.helloWorld();
		return ResponseEntity.ok(hello);
	}
	
	@GetMapping
	@RequestMapping(value = "/pt")
	public ResponseEntity dizerOla() {
		String ola = helloService.olaMundo();
		return ResponseEntity.ok(ola);
	}
	
}
