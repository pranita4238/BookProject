package com.example.demo.Service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Prod;
import com.example.demo.repo.ProdRepo;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	public ProdRepo prodrepos;
	@Override
	public void addProduct(Prod p) {
		prodrepos.save(p);
		
	}

	@Override
	public Prod getProduct(Integer id) {
		Optional <Prod> optionalProd=prodrepos.findById(id);
		return  optionalProd.get();
	}

	@Override
	public Prod getProductName(String pname) {
		Optional<Prod> optionalProd=prodrepos.findByName(pname);
		return optionalProd.get();
	}

	@Override
	public void updateProductPrize(Integer id, Integer newPrize) 
	{
		Prod prod=getProduct(id);
		prod.setPrice(newPrize);
		prodrepos.save(prod);
		
	}

	@Override
	public void deleteProduct(Integer id) {
		
		prodrepos.deleteById(id);
	}

}
