package ru.geekbrains.java1.test.work1;

/**
 * Created by Eduard on 03.02.2017.
 */
public class Test1 {
    public static void main(String[] args) {
        print2DTable();
    }

    public static void print2DTable() {
        for(int i = 0; i <= 10; i++) {
            System.out.printf("%2d ", i);
        }
        System.out.println();
        for (int i = 0; i <10; i++) {
            System.out.printf("%2d ", i+1);
            for (int j = 0; j < 10; j++) {
                System.out.printf("%2s ", "*");
            }
            System.out.println();
        }
    }

}
