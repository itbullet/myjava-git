package ru.geekbrains.java2.lesson1;

/**
 * Created by esa on 22.02.2017.
 */
public class MainClass {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal");
        Cat cat = new Cat("Barsik", "White");
        animal.animalInfo();
        cat.animalInfo();
        cat.catInfo();

        Animal a = new Animal();
        Cat c = new Cat("Barsik", "White");
        a.voice();
        c.voice();
    }
}
