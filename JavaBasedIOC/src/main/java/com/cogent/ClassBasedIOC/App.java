package com.cogent.ClassBasedIOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		Product product = context.getBean(Product.class);
		product.setName("Laptop");
		System.out.println(product.getName());

		Product product2 = context.getBean(Product.class);
		product2.setName("Desktop");
		System.out.println(product2.getName());
	}
}
