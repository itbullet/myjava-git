package ru.geekbrains.java2.lesson5;

import java.util.Arrays;

import static java.lang.Math.*;
import static java.lang.System.currentTimeMillis;

/**
 * Created by Eduard on 12.03.2017.
 */
public class MainClass {
    public static void main(String[] args) {
        // 1 thread - 17.9
        // 2 threads - 10.7
        // 4 threads - 8
        // 6 threads - 7.1
        // 8 threads - 4.6
        final int SIZE = 10000000;
        final int THREAD_COUNT = 8;
        final int PART_SIZE = SIZE/THREAD_COUNT;
        float[] mas = new float[SIZE];
        Arrays.fill(mas, 1f);
        long a = currentTimeMillis();
        float[][] m = new float[THREAD_COUNT][PART_SIZE];
        Thread[] t = new Thread[THREAD_COUNT];
        for(int i = 0; i < THREAD_COUNT; i++){
            System.arraycopy(mas, PART_SIZE * i, m[i], 0, PART_SIZE);
            final int u = i;
            t[i] = new Thread(() -> {
                int min = u * PART_SIZE;
                int max = (u + 1) * PART_SIZE;
                for(int j = min; j < max; j++) {
                    mas[j] = (float) (mas[j] * sin(0.2f + j / 5) * cos(0.2f + j / 5) * cos(0.4f + j / 2));
                }
            });
            t[i].start();
        }
        try {
            for (int i = 0; i < THREAD_COUNT; i++) {
                t[i].join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(currentTimeMillis() - a);
////////////////////////////////////////////////////
/*        final int SIZE = 10000000;
        final int THREAD_COUNT = 2;
        final int PART_SIZE = SIZE/THREAD_COUNT;
        float[] mas = new float[SIZE];
        Arrays.fill(mas, 1f);
        long a = currentTimeMillis();
        Thread[] t = new Thread[THREAD_COUNT];
        for(int i = 0; i < THREAD_COUNT; i++){
            final int u = i;
            t[i] = new Thread(() -> {
                int min = u * PART_SIZE;
                int max = (u + 1) * PART_SIZE;
                for(int j = min; j < max; j++) {
                    mas[j] = (float) (mas[j] * sin(0.2f + j / 5) * cos(0.2f + j / 5) * cos(0.4f + j / 2));
                }
            });
            t[i].start();
        }
        try {
            for (int i = 0; i < THREAD_COUNT; i++) {
                t[i].join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(currentTimeMillis() - a);*/
    }
}
