package br.uern.di.poo.exemplos.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.uern.di.poo.exemplos.spring.input.UserInput;
import br.uern.di.poo.exemplos.spring.model.User;
import br.uern.di.poo.exemplos.spring.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
    private UserRepository userRepository;


	public User newUser(UserInput input) {
		User user = new User();
	    user.setName(input.getName());
	    user.setEmail(input.getEmail());
	    return userRepository.save(user);		
	}
	
}
