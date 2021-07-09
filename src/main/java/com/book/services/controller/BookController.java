package com.book.services.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.services.entity.Book;
import com.book.services.service.BookService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/books")
@Slf4j
public class BookController {

	@Autowired
	private BookService bookService;
	
	@PostMapping("/")
	public Book saveBook(@RequestBody Book book) {
		//Log.info("Inside saveBook controller");
		return bookService.saveBook(book);
	}
	
	@GetMapping("/{id}")
	public Book findBookById(@PathVariable("id") String bookCode) {
		return bookService.findBookById(bookCode);
	}
	
	@PutMapping("/{id}/{incremental_count}")
	public Book updateBookAvailability(@PathVariable("id") String bookCode, @PathVariable("incremental_count")int bookCount) {
		return bookService.UpdateBook(bookCode, bookCount);
	}
	
	@GetMapping("/")
	public List<Book> getSubscription() {
		return bookService.getBook();
	}
}
