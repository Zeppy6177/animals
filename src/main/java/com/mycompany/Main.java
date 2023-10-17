package com.mycompany;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>(); // Creating an animal ArrayList
        
        // adding animals to the animal ArrayList
        animals.add(new Cat("Mammalia", "Ragdoll", "Luna", "White", (byte)4, "turkey"));
        animals.add(new Cat("Mammalia", "Abyssinian", "Oliver", "Brown", (byte)4, "tuna"));
        animals.add(new Dog("Mammalia", "Golden Retriever", "Max", "Dark golden", (byte)4, "ham"));
        animals.add(new Bird("Aves", "Parrot", "Mango", "green", (byte)2, "Mango"));
        animals.add(new Bird("Aves", "Canary", "Sunny", "yellow", (byte)2, "seeds"));
        animals.add(new Fish("Actinopterygii", "Goldfish", "Gulbert", "Gold", (byte)0, "goldfish flakes"));

        // executing the animal methods on each animal in the ArrayList
        System.out.println("==========================");
        for (Animal animal : animals) {
            animal.makeSound();
            animal.eat();
            animal.sleep();
            System.out.println("==========================");
        }
    }
}