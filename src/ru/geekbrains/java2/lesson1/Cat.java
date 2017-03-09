package ru.geekbrains.java2.lesson1;

/**
 * Created by esa on 22.02.2017.
 */
public class Cat extends Animal {
    protected String color;

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void catInfo() {
        System.out.println("Cat: " + name + " " + color);
    }

    @Override
    void voice() {
        super.voice();
        System.out.println("Кот мяукнул");
    }
}
