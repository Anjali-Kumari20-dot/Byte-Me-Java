package OOPS.Inheritance.HybridLevel;

public class Main {
    public static void main(String[] args) {
        Developer dev = new Developer("Anjali", 20, "Google", "Java");
        dev.display();
        dev.showCompany();
        dev.showSkills();
    }
}

interface Skills {
    void showSkills();
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Employee extends Person{
    String company;
    Employee (String name, int age, String company){
        super(name, age);
        this.company = company;
    }
    void showCompany() {
        System.out.println("Company : "+company);
    }
}

class Developer extends Employee implements Skills{
    String language;

    Developer(String name, int age, String company, String language){
        super(name, age, company);
        this.language = language;
    }

    public void showSkills(){
        System.out.println("Programming language : "+language);
    }
}