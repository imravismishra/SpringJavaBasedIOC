package com.cogent.ClassBasedIOC;

public class Product {

	private String name;

	public Product() {
		System.out.println("Product class object is created");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
