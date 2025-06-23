package OOPS.Polymorphism.MethodOverloading;

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        int x = c.add(2,3);
        double y = c.add(23.44, 33.6);
        int z = c.add(2, 30, 4);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}

class Calculator {
    int a, b;

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b){
        return a + b;
    }

    public int add(int a, int b, int c){
        return a + b + c;
    }

}