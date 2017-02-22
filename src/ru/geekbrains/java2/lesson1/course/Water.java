package ru.geekbrains.java2.lesson1.course;

import ru.geekbrains.java2.lesson1.competitors.Competitor;

/**
 * Created by Eduard on 22.02.2017.
 */
public class Water extends Obstacle {
    private int dist;

    public Water(int dist) {
        this.dist = dist;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.swim(dist);
    }
}
