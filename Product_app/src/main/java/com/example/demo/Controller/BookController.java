package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.BookListservice;
import com.example.demo.Service.BookServiceImpl;
import com.example.demo.model.Book;

@RestController
@CrossOrigin("*")
public class BookController {

		@Autowired
		public BookServiceImpl booklistservic;
		@GetMapping("/getBook/{id}")
		public ResponseEntity<?>getBookProduct(@PathVariable Integer id)
		{
			Book book=booklistservic.getBookProduct(id);
			if(book==null)
			{
				return new ResponseEntity<>("product not found with this id", HttpStatus.BAD_REQUEST);
			}
			else
			{
				return new ResponseEntity<>(book, HttpStatus.OK);
			}
		}
		@GetMapping("/getBookProduct")
		public ResponseEntity<?> getAllBookProduct(){

			return new ResponseEntity<>(booklistservic.getAllBookProduct(), HttpStatus.OK);
		}
		
		@PostMapping("/addBookProduct")
		public ResponseEntity<?> addProduct(@RequestBody Book book){
			booklistservic.saveBookProduct(book);
			return new ResponseEntity<> (" book product added",HttpStatus.OK);
		}

		@DeleteMapping("/deleteBookProduct/{id}")
		public ResponseEntity<?> deleteProduct(@PathVariable Integer id){
			booklistservic.deleteBookProduct(id);
			return new ResponseEntity<>("product has benn deleted",HttpStatus.OK);
			}
}
