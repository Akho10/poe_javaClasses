package com.example;

public class Main {

	public static void main(String[] args) {
		System.out.println("=========Animal Console Application==========");
		System.out.println("Creating animals....\n");
		Animal cow1 = new Cow("Browny","Brown");
		cow1.makeSound();
		Animal goat1 = new Goat("Goaty","White");
		goat1.makeSound();
		Animal snake1 = new Snake("Snakey","Black");
		snake1.makeSound();
		
		cow1.displayInfo();
		
		Person person1 = new Person("Job",13,goat1);
		person1.displayInfo();
		
		System.out.println("\nThe total pets are: " + Animal.getPetCount());
	}

}
