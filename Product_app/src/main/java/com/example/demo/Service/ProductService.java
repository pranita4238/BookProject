package com.example.demo.Service;

import com.example.demo.model.Prod;

public interface ProductService {
	
	public void addProduct(Prod p);
	public Prod getProduct(Integer id);
	public Prod getProductName(String pname);
	public void updateProductPrize(Integer id, Integer newPrize);
	public void deleteProduct(Integer id);
	
	

}
