package com.chrism.mvc.services;

import java.util.List;
import java.util.Optional;

//...
import org.springframework.stereotype.Service;

import com.chrism.mvc.models.Book;
import com.chrism.mvc.repositories.BookRepository;
@Service
public class BookService {
 // adding the book repository as a dependency
	private final BookRepository bookRepository;
 
 public BookService(BookRepository bookRepository) {
     this.bookRepository = bookRepository;
 }
 // returns all the books
 public List<Book> allBooks() {
     return this.bookRepository.findAll();
 }
 // creates a book
 public Book createBook(Book b) {
     return this.bookRepository.save(b);
 }
 // retrieves a book
 public Book findBook(Long id) {
     return this.bookRepository.findById(id).orElse(null);
 }
 
 // updates a book
 public Book updateBook(Book book) {
	 return this.bookRepository.save(book);
 }
 
 // deletes a book can be void, but returning a string to show it worked for now
 public void deleteBook(Long id) {
	 this.bookRepository.deleteById(id);
 }

}
