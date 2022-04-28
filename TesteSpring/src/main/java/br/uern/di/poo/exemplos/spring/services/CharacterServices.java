package br.uern.di.poo.exemplos.spring.services;

import java.util.Random;

import org.springframework.stereotype.Service;

import br.uern.di.poo.exemplos.spring.dto.CharacterDTO;
import br.uern.di.poo.exemplos.spring.input.CharacterInput;

@Service
public class CharacterServices {

	private static Random random = new Random();
	private static int characterNumber = 1;
	private static final int MAX_ATTRIBUTE = 20;
	    
	public CharacterDTO newCharacter() {
		CharacterDTO character = new CharacterDTO();
		character.setName("Character #" + characterNumber++);
	    character.setLevel(0);
	    character.setStrength(1+random.nextInt(MAX_ATTRIBUTE-1));
	    character.setAgility(1+random.nextInt(MAX_ATTRIBUTE-1));
	    character.setIntelligence(1+random.nextInt(MAX_ATTRIBUTE-1));
	    return character;
	}
	
	public CharacterDTO newCharacter(CharacterInput input) {
		CharacterDTO character = new CharacterDTO();
		character.setName(input.getName());
	    character.setLevel(input.getLevel());
	    character.setStrength(1+random.nextInt(MAX_ATTRIBUTE-1));
	    character.setAgility(1+random.nextInt(MAX_ATTRIBUTE-1));
	    character.setIntelligence(1+random.nextInt(MAX_ATTRIBUTE-1));
	    return character;
	}
	
}
