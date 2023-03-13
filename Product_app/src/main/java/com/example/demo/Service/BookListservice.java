package com.example.demo.Service;

import java.util.List;

import com.example.demo.model.Book;

public interface BookListservice {
	Book saveBookProduct(Book book) ;
	List<Book> getAllBookProduct();

	void deleteBookProduct(Integer id);
	Book  getBookProduct(Integer id);
	

}
