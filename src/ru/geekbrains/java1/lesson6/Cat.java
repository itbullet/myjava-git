package ru.geekbrains.java1.lesson6;

import java.util.Random;

/**
 * Created by Eduard on 10.02.2017.
 */
public class Cat extends Animal {
    private int max_length = 200;
    private double max_height = 2d;
    private int max_length_swim = 0;
    Random rand = new Random();

    public Cat () {
        this.max_length = rand.nextInt(max_length);
        this.max_height = Math.round(rand.nextDouble()*max_height*100.0)/100.0;
    }

    public boolean run (int length) {
        if(length > max_length) return false;
        return true;
    }

    public boolean swim (int length) {
        if(length > max_length_swim) return false;
        return true;
    }

    public boolean jump (double height) {
        if (height > max_height) return false;
        return true;
    }

    public int getMax_length() {
        return max_length;
    }

    public double getMax_height() {
        return max_height;
    }

    public int getMax_length_swim() {
        return max_length_swim;
    }
}
