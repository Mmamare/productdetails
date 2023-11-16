package com.amazon.productdetails.repo;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.amazon.productdetails.entity.ProductDetails;

@Repository
public interface ProductRepo extends MongoRepository<ProductDetails, BigInteger>{
	ProductDetails findProductById(String productId);
	ArrayList<ProductDetails> findAll();
	ProductDetails findProductById(UUID productId);

}
