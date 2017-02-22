package ru.geekbrains.java.lesson5;

/**
 * Created by esa on 07.02.2017.
 */
public class Cat {
    private String name;
    String color;
    private int age;

    public Cat(String  name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Cat(String  name){
        this.name = name;
        this.color = "Unknown";
        this.age = 1;
    }

    public Cat(){
        this.name = "Unknown";
        this.color = "Unknown";
        this.age = 1;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Введен некорректный возраст");
        }
    }

    public int getAge(){
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
