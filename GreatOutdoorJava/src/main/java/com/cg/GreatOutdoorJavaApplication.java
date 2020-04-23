package com.cg;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.dao.ProductDaoI;
import com.cg.entity.Product;

@SpringBootApplication
public class GreatOutdoorJavaApplication implements CommandLineRunner{
	
	@Autowired
	ProductDaoI produc;
	
	public static void main(String[] args) {
		SpringApplication.run(GreatOutdoorJavaApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		produc.create(new Product(1,"Running shoes", 2, 1799, "Puma", 8,"nothigNow"));
		
		
	
	}

}
