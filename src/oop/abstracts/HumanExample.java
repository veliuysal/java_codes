package oop.abstracts;

abstract class Human {
    private String name;
    private String surname;
    private int age;

    abstract void branch();

    public Human(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public Human(int age){
        this.age =age;
    }

    public void printFullName() {
        System.out.println("Fullname: " + name + " " + surname);
    }

    public void printAge() {
        System.out.println("Age: " + age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void  setSurname(String surname){
        this.surname = surname;
    }

    public  void setAge(int age) {
        this.age = age;
    }
}

class Student extends Human{

    public Student(String name, String surname) {
        super(name, surname);
    }

    @Override
    void branch() {
        System.out.println("It is a Student");
    }
}

class Teacher extends Human {

    public Teacher(int age) {
        super(age);
    }

    @Override
    void branch() {
        System.out.println("It is a Teacher");
    }
}

public class HumanExample {

    public static void main(String[] args) {
        Human student = new Student("Bilge","Adam");
        Human teacher = new Teacher(36);

        student.branch();
        student.printFullName();
        student.setAge(20);
        student.printAge();

        teacher.branch();
        teacher.printAge();
        teacher.setName("Veli");
        teacher.setSurname("UYSAL");
        teacher.printFullName();
    }
}
