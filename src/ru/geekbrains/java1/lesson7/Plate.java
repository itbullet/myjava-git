package ru.geekbrains.java1.lesson7;

/**
 * Created by esa on 15.02.2017.
 */
public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        if ((food - n) < 0) {
            return false;
        } else {
            food -= n;
            return true;
        }
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public void addFood(int n) {
        food += n;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }
}
