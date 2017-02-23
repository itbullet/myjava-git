package ru.geekbrains.java2.lesson1.course;

import ru.geekbrains.java2.lesson1.competitors.Competitor;
import ru.geekbrains.java2.lesson1.competitors.Team;

/**
 * Created by Eduard on 23.02.2017.
 */
public class Course {
    private Obstacle[] obstacles;

    public Course(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team){
        for (Competitor c : team.getCompetitors()) {
            for (Obstacle o : obstacles) {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }
    }
}
