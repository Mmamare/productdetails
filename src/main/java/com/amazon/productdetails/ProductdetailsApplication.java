package com.amazon.productdetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan
public class ProductdetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductdetailsApplication.class, args);
		
	}

}
