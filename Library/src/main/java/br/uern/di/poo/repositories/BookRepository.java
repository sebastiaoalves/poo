package br.uern.di.poo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.uern.di.poo.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
