package OOPS.TypesOFConstructors;

public class Main {
    public static void main(String[] args) {
        Warrior w1 = new Warrior();
        Warrior w2 = new Warrior("Ares", 100);
        Warrior w3 = new Warrior(w2);
    }
}

class Warrior {

    String name;
    int Strength;

    // default C.
    Warrior() {
        System.out.println("A nameless warrior enters the arena");
    }

    // Parameterised C.
    Warrior(String name, int Strength) {
        this.name = name;
        this.Strength = Strength;
        System.out.println(name + " summoned with strength " + Strength);
    }

    // Copy C.
    Warrior(Warrior original) {
        this.name = original.name;
        this.Strength = original.Strength;
        System.out.println(name + " has been cloned!");
    }
}