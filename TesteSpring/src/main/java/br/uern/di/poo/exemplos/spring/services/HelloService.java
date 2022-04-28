package br.uern.di.poo.exemplos.spring.services;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
	
	public String helloWorld() {
		return "Hello world"; 
	}
	
	public String olaMundo() {
		return "Olá Mundo"; 
	}

}
