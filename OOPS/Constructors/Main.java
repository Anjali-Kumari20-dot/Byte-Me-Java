package OOPS.Constructors;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("xyz");
        Product p2 = new Product("abc", 123.78);
        p1.displayStats();
        p2.displayStats();
    }
}
    class Product {
    private String name;
    private double price;

    // constructors with validation
    public Product(String name, double price){
        if(price < 0){
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.name = name;
        this.price = price;
    }

    // Overloaded constructors with default type
    public Product(String name){
        this(name, 0.0);
    }

    public void displayStats(){
        System.out.println("Product name : "+name+" , costs : Rs "+ price+"/-");
    }
}