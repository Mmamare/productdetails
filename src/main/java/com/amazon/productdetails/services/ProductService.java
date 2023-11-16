package com.amazon.productdetails.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.amazon.productdetails.entity.ProductDetails;

public interface ProductService {
	ProductDetails saveProduct(ProductDetails product);
	ArrayList<ProductDetails> getAllProducts();
	ProductDetails findProductById(UUID productId);
}
