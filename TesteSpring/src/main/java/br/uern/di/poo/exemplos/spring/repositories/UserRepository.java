package br.uern.di.poo.exemplos.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.uern.di.poo.exemplos.spring.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}