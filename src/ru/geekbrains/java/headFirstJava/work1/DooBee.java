package ru.geekbrains.java.headFirstJava.work1;

/**
 * Created by Eduard on 11.02.2017.
 */
public class DooBee {
    public static void main(String[] args) {
        int x = 1;
        while (x < 3) {
            System.out.print("Doo");
            System.out.print("Bee");
            x = x + 1;
        }
        if (x == 3) {
            System.out.print("Doo");
        }
    }
}
