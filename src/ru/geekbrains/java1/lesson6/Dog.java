package ru.geekbrains.java1.lesson6;

/**
 * Created by Eduard on 10.02.2017.
 */
public class Dog extends Animal {
    private int max_length = 500;
    private double max_height = 0.5d;
    private int max_length_swim = 10;

    public Dog () {
        this.max_length = rand.nextInt(max_length);
        this.max_height = Math.round(rand.nextDouble()*max_height*100.0)/100.0;
        this.max_length_swim = rand.nextInt(max_length_swim);
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
