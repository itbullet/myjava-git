package ru.geekbrains.java2.lesson1;

import ru.geekbrains.java2.lesson1.competitors.*;
import ru.geekbrains.java2.lesson1.course.*;

/**
 * Created by esa on 22.02.2017.
 */
public class MainClass {
    public static void main(String[] args) {
        Competitor[] competitors = {new Human("Bob"), new Cat("Barsik"), new Dog("Bobik"), new Dog("Sharik")};
        Obstacle[] course = {new Cross(300), new Wall(2), new Cross(800), new Water(5)};
        for (Competitor c : competitors) {
            for (Obstacle o : course) {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }
        System.out.println("\n===== RESULTS =====\n");
        for (Competitor c : competitors) {
            c.result();
        }
    }
}

