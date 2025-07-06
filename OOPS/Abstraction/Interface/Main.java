package OOPS.Abstraction.Interface;

interface Animal {
    void makeSound();
}

class Dog implements Animal {
    public void makeSound(){
        System.out.println("Woof Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
       Animal myDog = new Dog();
       myDog.makeSound(); 
    }
}
