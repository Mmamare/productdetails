package com.amazon.productdetails.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazon.productdetails.entity.ProductDetails;
import com.amazon.productdetails.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductRepo productRepo;
	
	ProductDetails productDetails;
	
	
	
	
	@Override
	public ProductDetails saveProduct(ProductDetails product) {
		return productRepo.insert(product);
	}

	@Override
	public ArrayList<ProductDetails> getAllProducts() {
		return productRepo.findAll();
	}

	@Override
	public ProductDetails findProductById(UUID productId) {
		
		return productRepo.findProductById(productId);
	}

}
