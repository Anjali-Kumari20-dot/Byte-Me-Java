package OOPS.Polymorphism.MethodOverriding;

import java.util.ArrayList;
import java.util.List;

public abstract class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());

        for(Animal a : animals){
            a.speak();
        }

        Animal ref = new Donkey();
        ref.speak(); 
    }
}

class Animal{
    void speak(){
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal{
    void speak() {
        super.speak(); // calls Animal's speak()
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{
    void speak() {
        System.out.println("Cat mewss");
    }
}

class Donkey extends Animal{
    void speak() {
        System.out.println("Donkey dhechu dhechu.");
    }
}