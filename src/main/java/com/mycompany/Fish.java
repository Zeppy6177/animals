package com.mycompany;

public class Fish extends Animal {
	Fish(String type, String breed, String name, String color, byte numLegs, String favFood) 
	{
		super(type, breed, name, color, numLegs, favFood);
	}
	
	void makeSound()
	{
		System.out.println(this.name + " ");
	}
}