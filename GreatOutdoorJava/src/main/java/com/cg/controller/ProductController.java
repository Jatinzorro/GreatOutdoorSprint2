package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Product;
import com.cg.service.ProductServiceI;

@CrossOrigin("*")
@RestController
public class ProductController {
	
	@Autowired
	ProductServiceI productService;
	
	@GetMapping(value="/product/{}")
	public Product findProduct(@PathVariable int id) {
		return productService.findProductById(id);
	}
	
	@GetMapping(value="/products")
	public List<Product> viewProducts(){
		return productService.retrieve();
	}
	
	@PostMapping(value="/product/new",consumes= {"application/json"})
	public String addProduct(@RequestBody Product product)
	{
		productService.create(product);
		return "Product Added Seccessfully";
	}
}
