package com.example;

public class Snake extends Animal {
	
	public Snake(String name, String color) {
		super(name, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeSound() {
		System.out.println("===Snake ===");
		System.out.println("Sssss sss\n");
		
	}

}
