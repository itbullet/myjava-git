package ru.geekbrains.java1.lesson6;

import java.util.Random;

/**
 * Created by Eduard on 10.02.2017.
 */
public class Animal {
    Random rand = new Random();

    public Animal(){}

    private int max_length = 0;
    private double max_height = 0.0d;
    private int max_length_swim = 0;

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
