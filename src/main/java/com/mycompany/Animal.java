package com.mycompany;

public abstract class Animal {
	String type;
	String breed;
	String name;
	String color;
	Byte numLegs;
	String favoriteFood;

	Animal(String type, String breed, String name, String color, byte numLegs, String favFood) 
	{
		this.type = type; this.breed = breed; this.name = name; this.color = color; this.numLegs = numLegs; this.favoriteFood = favFood;
	}

	abstract void makeSound();
	
	void eat()
	{
		System.out.println(this.name + " eats their favorite food " + this.favoriteFood);
	}

	void sleep()
	{
		System.out.println(this.name + " is sleeping (honk shoe)");
	}
}
