package OOPS.ShallowAndDeepCopy;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Wizard merlin = new Wizard("Merlin");

        Wizard shallowClone = new Wizard(merlin, true); // Shallow copy
        Wizard deepTwin = new Wizard(merlin); // deep copy

        shallowClone.addSpell("Lightning Strike");
        deepTwin.addSpell("Teleport");

        merlin.showSpells();
        shallowClone.showSpells();
        deepTwin.showSpells();
    }
}

class Spellbook {
    ArrayList<String> spells = new ArrayList<>();

    public Spellbook() {
        spells.add("Invisibility");
        spells.add("Fireball");
    }

    public Spellbook(Spellbook original) { // Deep copy Constructor
        this.spells = new ArrayList<>();
        for (String spell : original.spells) {
            this.spells.add(spell);
        }
    }
}

class Wizard {
    String name;
    Spellbook book;

    // Original Constructor
    public Wizard(String name) {
        this.name = name;
        this.book = new Spellbook();
    }

    // Shallow Copy Constructor
    public Wizard(Wizard original, boolean isShallow) {
        this.name = original.name + "_clone";
        this.book = original.book; // same book!
    }

    // Deep Copy Constructor
    public Wizard(Wizard original) {
        this.name = original.name + "_Twin";
        this.book = new Spellbook(original.book);// deep copy
    }

    public void addSpell(String spell) {
        book.spells.add(spell);
    }

    public void showSpells() {
        System.out.println(name + "'s spells: " + book.spells);
    }
}
