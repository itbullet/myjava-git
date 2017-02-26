package ru.geekbrains.java2.lesson1;

import ru.geekbrains.java2.lesson1.competitors.*;
import ru.geekbrains.java2.lesson1.course.*;

/**
 * Created by esa on 22.02.2017.
 */
public class MainClass {
    public static void main(String[] args) {
        Team team = new Team("Rocket", new Human("Escobar"), new Dog("Tarzan"), new Cat("Barsik"));
        Course course = new Course(new Cross(500), new Wall(1), new Water(1), new Cross(333));
        team.showInfo();
        course.doIt(team);
        team.showResults();
    }
}

