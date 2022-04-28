package br.uern.di.poo.exemplos.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.uern.di.poo.exemplos.spring.dto.CharacterDTO;
import br.uern.di.poo.exemplos.spring.input.CharacterInput;
import br.uern.di.poo.exemplos.spring.input.UserInput;
import br.uern.di.poo.exemplos.spring.model.User;
import br.uern.di.poo.exemplos.spring.services.CharacterServices;
import br.uern.di.poo.exemplos.spring.services.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	private UserService userService;
	    
	@PostMapping (value = "/new-user")
	public ResponseEntity<User> newUser(
			@RequestBody UserInput input){
		 User user = userService.newUser(input);
	     return ResponseEntity.ok(user);
    }
		
}
