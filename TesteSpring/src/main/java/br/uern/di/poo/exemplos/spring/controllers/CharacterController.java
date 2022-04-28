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
import br.uern.di.poo.exemplos.spring.services.CharacterServices;

@RestController
@RequestMapping(value = "/character")
public class CharacterController {

	@Autowired
	private CharacterServices charactersService;
	    
	@GetMapping (value = "/new-character")
	public ResponseEntity<CharacterDTO> newCharacter(){
		 CharacterDTO character = charactersService.newCharacter();
	     return ResponseEntity.ok(character);
    }
	
	@PostMapping (value = "/new-character")
	public ResponseEntity<CharacterDTO> newCharacter(
			@RequestBody CharacterInput input){
		 CharacterDTO character = charactersService.newCharacter(input);
	     return ResponseEntity.ok(character);
    }
}
