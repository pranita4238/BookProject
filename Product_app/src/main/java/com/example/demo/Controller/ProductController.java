package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.ProductService;
import com.example.demo.Service.ProductServiceImpl;
import com.example.demo.model.Prod;

import jakarta.annotation.PostConstruct;

@RestController
public class ProductController {

	@Autowired
	public ProductServiceImpl productservice;
	@GetMapping("/getProduct/{id}")
	
	public ResponseEntity<?> getProduct(@PathVariable Integer id)
	{
		Prod prod=productservice.getProduct(id);
		if(prod==null)
		{
			return new ResponseEntity<>("product not found with this id",HttpStatus.BAD_REQUEST);
		}
		else
		{
			return new ResponseEntity<>(prod,HttpStatus.OK);
		}
	}
	@GetMapping("/getProductByName/{name}")
	public ResponseEntity<?>getProductByname(@PathVariable String name)
	{

		Prod prod=productservice.getProductName(name);
		if(prod==null)
		{
			return new ResponseEntity<>("product not found with this id",HttpStatus.BAD_REQUEST);
		}
		else
		{
			return new ResponseEntity<>(prod,HttpStatus.OK);
		}
	}
	@PostMapping("/addProduct")
	public ResponseEntity<?>addProduct(@RequestBody Prod prod)
	{
		productservice.addProduct(prod);
		return new ResponseEntity<>("product added",HttpStatus.OK);
	}
	
	@PutMapping("/updateProduct/{id}/{newPrize}")
	public ResponseEntity<?>updateProductPrize(@PathVariable Integer id,@PathVariable Integer newPrize)
	{
		productservice.updateProductPrize(id, newPrize);
		return new ResponseEntity<>("product updated succesfully",HttpStatus.OK);
		
	}
	
	@DeleteMapping("/deleteProduct/{id}")
	public ResponseEntity<?>deleteProduct(@PathVariable Integer id)
	{
		productservice.deleteProduct(id);
		return new ResponseEntity<>("product deleted succesfully",HttpStatus.OK);
		
	}
}
	
	
	
	

