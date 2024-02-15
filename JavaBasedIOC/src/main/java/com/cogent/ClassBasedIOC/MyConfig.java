package com.cogent.ClassBasedIOC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfig {

	@Bean
	@Scope("prototype")
	public Product getProduct() {

		return new Product();
	}
}
