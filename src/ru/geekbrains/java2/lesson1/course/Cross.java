package ru.geekbrains.java2.lesson1.course;

import ru.geekbrains.java2.lesson1.competitors.Competitor;

/**
 * Created by Eduard on 22.02.2017.
 */
public class Cross extends Obstacle {
    private int dist;

    public Cross(int dist) {
        this.dist = dist;
    }
    @Override
    public void doIt(Competitor competitor) {
        competitor.run(dist);
    }
}
