package OOPS.Polymorphism.CoreFeaturesAndConstructs;

public class Main {
    public static void main(String[] args) {
        Parent p = new Child(); // Polymorphic reference
        Animal pet = p.getPet(); // will actually return a Dog object

        System.out.println("Pet is of type: " + pet.getClass().getSimpleName());

        // safe downcasting if u want to call dog-specific methods
        if (pet instanceof Dog) {
            Dog dog = (Dog) pet;
            System.out.println("Woof! This is definately a dog.");
        }
    }
}

class Animal {}

class Dog extends Animal {}

class Parent {
    Animal getPet() {
        return new Animal();
    }
}

class Child extends Parent {
    @Override
    Dog getPet() {
        return new Dog();
    }
}