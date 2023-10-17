package com.mycompany;

public class Cat extends Animal {
	Cat(String type, String breed, String name, String color, byte numLegs, String favFood) 
	{
		super(type, breed, name, color, numLegs, favFood);
	}
	
	void makeSound()
	{
		System.out.println(this.name + " meows");
	}
}
