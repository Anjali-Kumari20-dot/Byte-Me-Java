package OOPS.Inheritance.SingleLevel;

public class Main {
    public static void main(String[] args) {
        Person x = new Person();
        Patient p = new Patient("xyz", 1111, "Female", "Dancing");
        p.displayStats();
        p.treatmentPlan();
    }
}

class Person {
    String name;
    int age;
    String gender;

    Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    Person() {};

    void displayStats(){
        System.out.println("Name : "+name+" age : " + age + " gender : " + gender );
    }
}

class Patient extends Person {
    String disease;

    Patient(String name, int age, String gender, String disease){
        super(name, age, gender);
        this.disease = disease;
    };

    void treatmentPlan(){
        
        System.out.println("You have : " + disease+ ". So Eat well, sleep well, take proper rest");
    }
}