package com.chrism.mvc.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chrism.mvc.models.Book;
import com.chrism.mvc.services.BookService;

//..

@RestController
public class BooksApi {
 private final BookService bookService;
 public BooksApi(BookService bookService){
     this.bookService = bookService;
 }
 @RequestMapping("/api/books")
 public List<Book> index() {
     return bookService.allBooks();
 }
 
 @RequestMapping(value="/api/books", method=RequestMethod.POST)
 public Book create(@RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {
     Book book = new Book(title, desc, lang, numOfPages);
     return bookService.createBook(book);
 }
 
 @RequestMapping(value="/api/books/{id}", method=RequestMethod.GET)
 public Book show(@PathVariable("id") Long id) {
	 return this.bookService.findBook(id);
 }
 

  // other methods removed for brevity
  @RequestMapping(value="/api/books/{id}", method=RequestMethod.PUT)
  public Book update(@PathVariable("id") Long id, Book book) {
	  return this.bookService.updateBook(book);
  }
  
  @RequestMapping(value="/api/books/{id}", method=RequestMethod.DELETE)
  public void destroy(@PathVariable("id") Long id) {
      bookService.deleteBook(id);
  }
}
