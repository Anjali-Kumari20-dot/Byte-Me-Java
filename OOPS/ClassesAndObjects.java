package OOPS;

public class ClassesAndObjects {

    public static void main(String[] args) {
      Pen p1 = new Pen();  // created a pen object called p1
      p1.setColor("Blue");
      System.out.println(p1.color);
      p1.setTip(5);
      System.out.println(p1.tip);
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;
}