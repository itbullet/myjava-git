package ru.geekbrains.java.lesson5;

/**
 * Created by esa on 07.02.2017.
 */
/*
Создаем класс Employee с полями Имя, Фамилия, email, телефон, зарплата, возраст.
 */
public class Employee {
    private String name;
    private String surname;
    private String email;
    private String mobile_number;
    private int salary;
    private int age;
/*
Конструктор класса заполняет поля Имя, Фамилия, email, телефон, зарплата, возраст при создании объекта
 */
    public Employee(String name, String surname, String email, String mobile_number, int salary, int age) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.mobile_number = mobile_number;
        this.salary = salary;
        this.age = age;
    }
/*
метод info выводит информацию об объекте в консоль
 */
    public void info(){
        System.out.print("Name: " + name + " ");
        System.out.print("Surname: " + surname + " ");
        System.out.print("Email: " + email + " ");
        System.out.print("Mobile number: " + mobile_number + " ");
        System.out.print("Salary: " + salary + " ");
        System.out.println("Age: " + age + "\n");
    }
/*
Создаем геттер для получения поля age
 */
    public int getAge() {
        return age;
    }
}
