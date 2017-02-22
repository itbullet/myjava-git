package ru.geekbrains.java.lesson7;

/**
 * Created by esa on 15.02.2017.
 */
public class MainClass {
    public static void main(String[] args) {
        Cat[] cats1 = {new Cat("Murka", 10), new Cat("Barsik", 12), new Cat("Pushok", 15), new Cat("Tolstoy", 20), new Cat("Melkiy", 5)};
        Plate plate1 = new Plate(43);

        plate1.info();
        for (Cat o : cats1) {
            o.eat(plate1);
        }
        plate1.info();
        for (Cat o : cats1) {
            o.info();
        }
        plate1.addFood(50);
        plate1.info();
    }
}
