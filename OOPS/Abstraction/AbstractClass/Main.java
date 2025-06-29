package OOPS.Abstraction.AbstractClass;

abstract class Animal{
    String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void makeSound() ;

    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

class Dog extends Animal{
    Dog(String name) {
        super(name);
    }

    void makeSound() {
        System.out.println(name + " says: Woof!");
    }
}

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.makeSound();
        dog.sleep();
    }
}