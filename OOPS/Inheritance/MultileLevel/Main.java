package OOPS.Inheritance.MultileLevel;

public class Main {
    public static void main(String[] args) {
        Manager m = new Manager("Alice", 35 , "TechCorp", "Engineering");
        m.showInfo();
        m.showCompany();
        m.showDepartment();
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showInfo() {
        System.out.println("Name : " + name + ", Age : " + age);
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

class Manager extends Employee{
    String department;

    Manager(String name, int age, String company, String department){
        super(name, age, company);
        this.department = department;
    }

    void showDepartment(){
        System.out.println("Department: " + department);
    }
}
