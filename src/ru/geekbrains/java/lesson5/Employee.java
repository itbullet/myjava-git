package ru.geekbrains.java.lesson5;

/**
 * Created by esa on 07.02.2017.
 */
public class Employee {
    private String name;
    private String surname;
    private String email;
    private String mobile_number;
    private int salary;
    private int age;

    public Employee(String name, String surname, String email, String mobile_number, int salary, int age) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.mobile_number = mobile_number;
        this.salary = salary;
        this.age = age;
    }

    public void info(){
        System.out.print("Name: " + name + " ");
        System.out.print("Surname: " + surname + " ");
        System.out.print("Email: " + email + " ");
        System.out.print("Mobile number: " + mobile_number + " ");
        System.out.print("Salary: " + salary + " ");
        System.out.println("Age: " + age + "\n");
    }

    public int getAge() {
        return age;
    }
}
