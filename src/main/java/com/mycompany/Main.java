package com.mycompany;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Bird());
        animals.add(new Bird());
        animals.add(new Fish());

        for (Animal animal : animals) {
            animal.makeSound();
            animal.eat();
            animal.sleep();
        }
    }
}