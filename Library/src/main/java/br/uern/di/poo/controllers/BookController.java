package br.uern.di.poo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.uern.di.poo.input.BookInput;
import br.uern.di.poo.model.Book;
import br.uern.di.poo.services.BookServices;

@RestController
@RequestMapping(value = "/book")
public class BookController {

	@Autowired
	BookServices bookServices;
	
	@PostMapping
	public ResponseEntity<Book> newBook(@RequestBody BookInput bookInput) {
		Book book = bookServices.newBook(bookInput);
		return ResponseEntity.ok(book);
	}
	
	@GetMapping
	public ResponseEntity<List<Book>> getBooks(){
		List<Book> books = bookServices.getBooks();
		return ResponseEntity.ok(books);
	}
	
	@GetMapping (value = "/{bookId}")
	public ResponseEntity<Book> getBook(@PathVariable Long bookId) {
		Book book = bookServices.getBook(bookId);
		return ResponseEntity.ok(book);
	}

}
