package com.example.demo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Prod;

public interface ProdRepo extends JpaRepository<Prod, Integer>{

	Optional<Prod> findByName(String pname);

	

}
