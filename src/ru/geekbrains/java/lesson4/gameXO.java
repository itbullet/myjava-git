package ru.geekbrains.java.lesson4;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Eduard on 05.02.2017.
 */
public class gameXO {
    public static char[][] map;
    public static final int SIZE = 5;
    public static final int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '\u2022';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();
    public static int xHuman, yHuman;

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил компьютер");
                break;
            }
            if (isMapFull()) {
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
            System.out.printf("%2d ", i);
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.printf("%2d ", (i + 1));
            for (int j = 0; j < SIZE; j++) {
                System.out.printf("%2c ", map[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void humanTurn() {
        //int xHuman, yHuman;
        do {
            System.out.println("Введите координаты в формате X Y");
            xHuman = sc.nextInt() - 1;
            yHuman = sc.nextInt() - 1;
        } while (!isCellValid(xHuman, yHuman));
        map[yHuman][xHuman] = DOT_X;
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
        } while (/*!isCellValid(x, y) && */!blockHumanTurn(x, y));
        /*Вместо обычной проверки методом isCellValid проверяем ячейку методом blockHuman а уже в ней проверяем
        методом isCellValid
         */
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    public static boolean checkWin(char symb) {
        /*
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
        }*/

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (checkLine(i, j, 1, 0, symb)) {
                    return true;
                }
                if (checkLine(i, j, 0, 1, symb)) {
                    return true;
                }
                if (checkLine(i, j, 1, 1, symb)) {
                    return true;
                }
                if (checkLine(i, j, 1, -1, symb)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkLine(int cx, int cy, int vx, int vy, char symb) {
        if (cx + DOTS_TO_WIN * vx > SIZE || cy + DOTS_TO_WIN * vy > SIZE || cy + DOTS_TO_WIN * vy < -1) {
            return false;
        }
        for (int i = 0; i < DOTS_TO_WIN; i++) {
            if (map[cy + i * vy][cx + i * vx] != symb) {
                return false;
            }
        }
        return true;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
//Простой метод для блокирования хода человека в радиусе одной клетки
    public static boolean blockHumanTurn(int x, int y) {
        if (isCellValid(x, y)) {
            if (y - 1 == yHuman && x - 1 == xHuman) {
                return true;
            } else if (y == yHuman && x - 1 == xHuman) {
                return true;
            } else if (y + 1 == yHuman && x - 1 == xHuman) {
                return true;
            } else if (y - 1 == yHuman && x == xHuman) {
                return true;
            } else if (y + 1 == yHuman && x == xHuman) {
                return true;
            } else if (y - 1 == yHuman && x + 1 == xHuman) {
                return true;
            } else if (y == yHuman && x + 1 == xHuman) {
                return true;
            } else if (y + 1 == yHuman && x + 1 == xHuman) {
                return true;
            }
        }
        return false;
    }
}
