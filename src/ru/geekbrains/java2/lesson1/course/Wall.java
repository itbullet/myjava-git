package ru.geekbrains.java2.lesson1.course;

import ru.geekbrains.java2.lesson1.competitors.Competitor;

/**
 * Created by Eduard on 22.02.2017.
 */
public class Wall extends Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.jump(height);
    }
}