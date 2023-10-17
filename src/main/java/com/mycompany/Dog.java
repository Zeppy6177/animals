package com.mycompany;

public class Dog extends Animal {
	Dog(String type, String breed, String name, String color, byte numLegs, String favFood) 
	{
		super(type, breed, name, color, numLegs, favFood);
	}
	
	void makeSound()
	{
		System.out.println(this.name + " barks");
	}
}
