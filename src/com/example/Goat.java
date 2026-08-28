package com.example;

public class Goat extends Animal{

	
	public Goat(String name, String color) {
		super(name, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeSound() {
		System.out.println("===Goat ===");
		System.out.println("Meeeh meeh\n");
		
	}

}
