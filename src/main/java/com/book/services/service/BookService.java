package com.book.services.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.services.entity.Book;
import com.book.services.repository.BookRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	

	public Book saveBook(Book book) {
		//Log.info("Inside save book service");
		return bookRepository.save(book);
	}

	public Book findBookById(String bookCode) {
		return bookRepository.findByBookCode(bookCode);
	}

	public Book UpdateBook(String bookCode, int bookCount) {
		Book book = findBookById(bookCode);
		book.setBooksAvailable(bookCount);
		return bookRepository.save(book);
	}

	public List<Book> getBook() {
		return bookRepository.findAll();
	}

	

}
