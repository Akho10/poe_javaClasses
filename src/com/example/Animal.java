package com.example;

public abstract class Animal implements Sound {

	private String name;
	private String color;
	private static int petCount;
	
	public Animal(String name,String color) {
		this.name=name;
		this.color=color;
		petCount++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public static int getPetCount() {
		return petCount;
	}

	public void displayInfo() {
		System.out.println("\n===Animal===");
		System.out.println("Name: "+ name);
		System.out.println("Color: "+ color);
		makeSound();
		
	}
	
}
