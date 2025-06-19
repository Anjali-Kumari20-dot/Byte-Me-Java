package OOPS.AccessSpecifier;

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();

        System.out.println(a.name); // public - accessible
        // System.out.println(a.age); // private - compile-time error
        System.out.println(a.type); // protected - same package
        System.out.println(a.habitat); // default - same package
    }
}

class Animal {
    public String name = "Elephant"; // accessible anywhere
    private int age = 10; // accessible only inside Animal
    protected String type = "Mammal"; // accessible in same package or subClasses
    String habitat = "Forest"; // default/package-private
}
