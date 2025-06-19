package OOPS.Encapsulation;

public class Main {
    public static void main(String[] args) {
        GameCharacter g = new GameCharacter();

        g.setName("Anjali Kumari");
        g.setHealth(20);
        g.setLevel(99);

        g.displayStats();
    }
}

class GameCharacter{
    // private fields - hidden outside access
    private String name;
    private int health;
    private int level;

    // Setter for name
    public void setName(String name){
        this.name = name;
    }

    // Setter for Health
    public void setHealth(int health){
        this.health = health;
    }

    // Setter for Level
    public void setLevel(int level){
        this.level = level;
    }

    // Getter for name
    public String getName(){
        return name;
    }

    // Getter for health
    public int getHealth(){
        return health;
    }

    // Getter for level
    public int getLevel(){
        return level;
    }

    // Display character stats
    public void displayStats() {
        System.out.println("Player:  " + name + " | Level: " + level + " | Health: " + health);
    }
}