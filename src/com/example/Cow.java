package com.example;

public class Cow extends Animal{
	
	public Cow(String name, String color) {
		super(name, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeSound() {
		System.out.println("===Cow ===");
		System.out.println("Moo mooo\n");	
	}
}
