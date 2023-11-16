package com.amazon.productdetails.controller;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.amazon.productdetails.entity.ProductDetails;
import com.amazon.productdetails.services.ProductServiceImpl;

@RestController
@RequestMapping("/amazon/products/")
public class ProductController {
	@Autowired
	ProductServiceImpl productService;
	
	@PostMapping("saveproduct")
	public ProductDetails saveProductToDb(@RequestBody ProductDetails product) {
		return productService.saveProduct(product);
	}
	
	@GetMapping("getAllProducts/{productId}")
	public ArrayList<ProductDetails> getAllProducts(){
		return productService.getAllProducts();
		}
	@GetMapping("search/{productId}")
	public ProductDetails getProductById(@PathVariable UUID productId) {
		return productService.findProductById(productId);
	}
}
