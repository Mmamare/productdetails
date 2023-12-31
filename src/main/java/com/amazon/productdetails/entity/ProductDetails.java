package com.amazon.productdetails.entity;

import java.math.BigInteger;
import java.util.UUID;

import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.*;

@Document
//@Data
//@AllArgsConstructor
public class ProductDetails {
	@Id
	@GeneratedValue
	private BigInteger id;
	//private UUID productId = UUID.randomUUID().toString();
	private UUID productId = UUID.randomUUID();
	private String name;
	private double price;
	private double rating;
	private String imageURL;
	
	
	public ProductDetails() {
		super();
		
	}


	public ProductDetails( String name, double price, double rating, String imageURL) {
		super();
//		this.productId = productId;
		this.name = name;
		this.price = price;
		this.rating = rating;
		this.imageURL = imageURL;
	}

	

	public BigInteger getId() {
		return id;
	}


	public void setId(BigInteger id) {
		this.id = id;
	}


	public UUID getProductId() {
		return productId;
	}


	public void setProductId(UUID productId) {
		this.productId = productId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public double getRating() {
		return rating;
	}


	public void setRating(double rating) {
		this.rating = rating;
	}


	public String getImageURL() {
		return imageURL;
	}


	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}


	
	
}

