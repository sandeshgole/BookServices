package com.book.services.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book.services.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, String>{

	Book findByBookCode(String bookCode);

}
