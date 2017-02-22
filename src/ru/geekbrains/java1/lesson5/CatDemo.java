package ru.geekbrains.java1.lesson5;

/**
 * Created by esa on 07.02.2017.
 */
public class CatDemo {
    public static void main(String[] args) {
        Cat cat1;
        cat1 = new Cat("Barsik", "White", 4);
        Cat cat2 = new Cat("Murzik", "Black", 6);
        Cat cat3 = new Cat("Muska");
        System.out.println("Cat1 name: " + cat1.getName() + " color: " + cat1.color + " age: " + cat1.getAge());
        System.out.println("Cat2 name: " + cat2.getName() + " color: " + cat2.color + " age: " + cat2.getAge());
        cat3.setAge(7);
        System.out.println("Cat3 name: " + cat3.getName() + " color: " + cat3.color + " age: " + cat3.getAge());
    }
}
