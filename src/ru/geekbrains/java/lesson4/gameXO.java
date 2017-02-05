package ru.geekbrains.java.lesson4;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Eduard on 05.02.2017.
 */
public class gameXO {
    public static char[][] map;
    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '\u2022';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true){
            humanTurn();
            printMap();
            if(checkWin0(DOT_X)){
                System.out.println("Победил человек");
                break;
            }
            if(isMapFull()){
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if(checkWin0(DOT_O)){
                System.out.println("Победил компьютер");
                break;
            }
            if(isMapFull()){
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        } else if (map[y][x] == DOT_EMPTY) {
            return true;
        } else {
            return false;
        }
    }

    public static void aiTurn() {
        int x = -1, y = -1;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x+1) + " " + (y+1));
        map[y][x] = DOT_O;
    }

    public static boolean checkWin0 (char symb) {
        if (map[0][0]==symb&&map[0][1]==symb&&map[0][2]==symb) {
            return true;
        }
        if (map[1][0]==symb&&map[1][1]==symb&&map[1][2]==symb) {
            return true;
        }
        if (map[2][0]==symb&&map[2][1]==symb&&map[2][2]==symb) {
            return true;
        }

        if (map[0][0]==symb&&map[1][0]==symb&&map[2][0]==symb) {
            return true;
        }
        if (map[0][1]==symb&&map[1][1]==symb&&map[2][1]==symb) {
            return true;
        }
        if (map[0][2]==symb&&map[1][2]==symb&&map[2][2]==symb) {
            return true;
        }

        if (map[0][0]==symb&&map[1][1]==symb&&map[2][2]==symb) {
            return true;
        }
        if (map[2][0]==symb&&map[1][1]==symb&&map[0][2]==symb) {
            return true;
        }

        return false;
    }

    public static boolean isMapFull(){
        for (int i=0; i<SIZE; i++) {
            for (int j=0; j<SIZE; j++){
                if (map[i][j] == DOT_EMPTY){
                    return false;
                }
            }
        }
        return true;
    }
}
