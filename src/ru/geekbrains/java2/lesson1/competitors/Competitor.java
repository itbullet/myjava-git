package ru.geekbrains.java2.lesson1.competitors;

/**
 * Created by Eduard on 22.02.2017.
 */
public interface Competitor {
    void run(int dist);
    void swim(int dist);
    void jump(int height);
    void result();
    boolean isOnDistance();
    void info();
}
