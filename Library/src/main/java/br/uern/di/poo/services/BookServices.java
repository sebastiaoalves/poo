package br.uern.di.poo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.uern.di.poo.input.BookInput;
import br.uern.di.poo.model.Book;
import br.uern.di.poo.repositories.BookRepository;

@Service
public class BookServices {

	@Autowired
	BookRepository bookRepository;
	
	public Book newBook(BookInput bookInput) {
		Book book = new Book();
		book.setTitle(bookInput.getTitle());
		book.setAuthor(bookInput.getAuthor());
		book.setYear(bookInput.getYear());
		book.setCopies_number(10);
		return bookRepository.save(book);	
	}
	
	public List<Book> getBooks(){
		return bookRepository.findAll(); 
	}
	
	public Book getBook(Long bookId) {
		Optional<Book> book = bookRepository.findById(bookId);
		if(book.isPresent())
			return book.get();
		else
			return null;
	}
	
}
