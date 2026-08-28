package com.example;

public class Person implements Sound{

	private String name;
	private int age;
	private Animal animal;
	
	public Person(String name, int age, Animal animal) {
		super();
		this.name = name;
		this.age = age;
		this.animal = animal;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
	public void displayInfo() {
		System.out.println("\n===Person info===");
		System.out.println("My name is: "+ name);
		System.out.println("I am: "+ age);
		System.out.println("My pet name is: "+ animal.getName());
		System.out.println("Pet color: "+ animal.getColor());
		//animal.makeSound();
		
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Hahhahaha");
		
	}
	
	
	
}
