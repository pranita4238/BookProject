package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.repo.BookRepo;

@Service
public class BookServiceImpl implements BookListservice {

		@Autowired
		public BookRepo bookrepo;

		@Override
		public Book saveBookProduct(Book book) {
		
			return bookrepo.save(book);
		}

		@Override
		public List<Book> getAllBookProduct() {
		
			return bookrepo.findAll();
		}

		@Override
		public void deleteBookProduct(Integer id) {
			
			Optional<Book> getProduct=bookrepo.findById(id);
			bookrepo.deleteById(id);
		}

		@Override
		public Book getBookProduct(Integer id) {
			// TODO Auto-generated method stub
			Optional<Book> getProductOptional=bookrepo.findById(id);
			return getProductOptional.get();
		}
	

}
