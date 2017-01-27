package ru.geekbrains.java.lesson2;

import sun.plugin.javascript.navig.Array;

import java.util.Arrays;

/**
 * Created by Eduard on 27.01.2017.
 */
public class MainClass {
    public static void main(String[] args) {
        //вызываем метод substituteArray
        substituteArray();
        //вызываем метод fillArray
        fillArray();
        //вызываем метод multiplyBy2Less6
        multiplyBy2Less6();
        //вызываем метод fillDiagWith1
        fillDiagWith1();
    }
    //Задание 1: создаем метод substituteArray
    public static void substituteArray () {
        //создаем массив и заполняем его
        byte arr[] = { 1, 0, 0, 1, 1, 1, 0, 0, 1, 0};
        //выводим массив arr в консоль
        System.out.println("Задание 1:\n" + Arrays.toString(arr));
        //создаем цикл и перебираем все элементы
        for(int i = 0; i < arr.length; i++) {
            //с помощью условия меняем 0 на 1, а 1 на 0
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        //выводим массив arr после замены чисел
        System.out.println(Arrays.toString(arr));
    }
    //Задание 2: создаем метод fillArray
    public static void fillArray () {
        //создаем пустой целочисленный массив размером 8
        int arr[] = new int[8];
        //создаем цикл для заполнения массива arr числами i*3
        for (int i = 0; i < 8; i++) {
            arr[i] = i * 3;
        }
        //выводим массив arr в консоль
        System.out.println("Задание 2:\n" + Arrays.toString(arr));
    }
    //Задание 3: создаем метод multiplyBy2Less6
    public static void multiplyBy2Less6 () {
        //создаем целочисленный массив и заполняем его
        byte arr[] = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        //выводим массив arr в консоль
        System.out.println("Задание 3:\n" + Arrays.toString(arr));
        //проходим циклом по массиву arr
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 6) {
                arr[i] *= 6;
            }
        }
        //выводим массив arr в консоль после цикла
        System.out.println(Arrays.toString(arr));
    }
    //Задание 4: создаем метод fillDiagWith1
    public static void fillDiagWith1 () {
        //созадем двухмерный массив arr размером 7х7
        int[][] arr = new int[7][7];
        System.out.println("Задание 4:");
        //Циклом пробегаемся по всем ячейкам массива, в диагональные ячейки проставляем 1 и выводим массив построчно
        for (int i = 0; i < 7; i++) {
            arr[i][i] = 1;
            arr[i][arr.length-1-i] = 1;
            for (int j = 0; j < 7; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
