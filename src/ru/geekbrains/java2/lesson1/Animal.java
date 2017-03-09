package ru.geekbrains.java2.lesson1;

/**
 * Created by esa on 22.02.2017.
 */
public class Animal {
    protected String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public void animalInfo() {
        System.out.println("Animal: " + name);
    }

    void voice() {
        System.out.println("Животное издало звук");
    }
}
