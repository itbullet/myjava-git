package ru.geekbrains.java1.lesson2;

import java.util.Arrays;

/**
 * Created by Eduard on 27.01.2017.
 */
public class MainClass {
    public static void main(String[] args) {
        //создаем массив arr1 для использования его в методе chkArrBalance
        int arr1[] = {2, 10, 1, 3, 14, 2};
        //создаем массив arr2 для использования его в методе rotateArr
        int arr2[] = {1, 2, 3, 4, 5, 6};
        //создаем переменную movestep для смещения позиций в массиве arr2
        int movestep = -2;
        //вызываем метод substituteArray
        substituteArray();
        //вызываем метод fillArray
        fillArray();
        //вызываем метод multiplyBy2Less6
        multiplyBy2Less6();
        //вызываем метод fillDiagWith1
        fillDiagWith1();
        //вызываем метод findMaxMin
        findMaxMin();
        //выводим значение метода chkArrBlnc
        System.out.println("\n" + chkArrBalance(arr1));
        //вызываем метод rotateArr
        rotateArr(arr2, movestep);
    }

    //Задание 1: создаем метод substituteArray
    public static void substituteArray() {
        //создаем массив и заполняем его
        byte arr[] = {1, 0, 0, 1, 1, 1, 0, 0, 1, 0};
        //выводим массив arr в консоль
        System.out.println("Задание 1:\n" + Arrays.toString(arr));
        //создаем цикл и перебираем все элементы
        for (int i = 0; i < arr.length; i++) {
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
    public static void fillArray() {
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
    public static void multiplyBy2Less6() {
        //создаем целочисленный массив и заполняем его
        byte arr[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        //выводим массив arr в консоль
        System.out.println("Задание 3:\n" + Arrays.toString(arr));
        //проходим циклом по массиву arr
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 6;
            }
        }
        //выводим массив arr в консоль после цикла
        System.out.println(Arrays.toString(arr));
    }

    //Задание 4: создаем метод fillDiagWith1
    public static void fillDiagWith1() {
        //созадем двухмерный массив arr размером 7х7
        int[][] arr = new int[7][7];
        System.out.println("Задание 4:");
        //Циклом пробегаемся по всем ячейкам массива, в диагональные ячейки проставляем 1 и выводим массив построчно
        for (int i = 0; i < 7; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - 1 - i] = 1;
            for (int j = 0; j < 7; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Задание 5: создаем метод findMaxMin - поиск минимального и максимального элемента в массиве
    public static void findMaxMin() {
        //задаем одномерный массив arr
        int arr[] = {2, 5, 6, 1, 9, 20, 3, 8, 0, 21};
        //задаем переменным min и max первичные значения равные первой ячейке массива arr
        int min = arr[0], max = arr[0];
        /*с помощью цикла перебираем массив arr и в случае если значение ячейки больше значения max
        или меньше значения min заменяем их
         */
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        //Выводим массив arr
        System.out.println("Задание 5:\n" + Arrays.toString(arr));
        //выводим максимальное значение
        System.out.println("Максимальное число: " + max);
        //выводим минимальное значение
        System.out.println("Минимальное число: " + min);
    }

    //Задание 6: создаем метод chkArrBlnc
    public static boolean chkArrBalance(int[] arr) {
        /* создаем переменные sumLeft для хранения суммы ячеек слева,
        sumRight для хранения суммы ячеек справа, chkEven для хранения суммы всех ячеек,
        left для перебора ячеек слева и right для перебора ячеек справа
         */
        int sumLeft = 0, sumRight = 0, chkEven = 0, left = 0, right = arr.length - 1;
        //суммируем все ячейки в массиве arr
        for (int i = 0; i < arr.length; i++) {
            chkEven += arr[i];
        }
        /*если сумма всех ячеек не четная то сумма левой и правой стороны не может быть равны,
        если сумма четная то можно попробовать найти баданс между левой и правой частью
         */
        System.out.println("Задание 6:");
        if (chkEven % 2 != 0) {
            //возвращаем false
            return false;
        } else {
            /*назначаем переменной sumLeft значение первой ячейки,
            назначаем переменной sumRight значение последней ячейки
             */
            sumLeft = arr[left];
            sumRight = arr[right];
            /* пока переменная left меньше переменной right-1 перебираем массив arr,
            двигаясь слева и справа к центру массива,
            прибавляем к переменной SumLeft следующую ячейку слева если переменная SumLeft меньше SumRight,
            прибавляем к переменной SumКшпре следующую ячейку справа если переменная SumRight меньше SumLeft
             */
            while (left < right - 1) {
                if (sumLeft < sumRight) {
                    left++;
                    sumLeft += arr[left];
                } else {
                    right--;
                    sumRight += arr[right];
                }
            }
            /* если переменные SumRight и SumLeft равны то возвращаем true и выводим значения ячеек массива
            с знаком || между левой и правой частью где был найден баланс,
            в противвном случае возвращаем false
             */
            if (sumLeft == sumRight) {
                for (int i = 0; i < arr.length; i++) {
                    if (i != arr.length - 1) {
                        System.out.print(arr[i] + ", ");
                    } else {
                        System.out.print(arr[i]);
                    }
                    if (i == left) {
                        System.out.print(" || ");
                    }
                }
                return true;
            } else {
                return false;
            }
        }
    }

    //Задание 7: создаем метод rotateArr
    public static void rotateArr(int arr[], int step) {
        if (step > 0) {
            System.out.println("Задание 7: передвинуть массив\n" + Arrays.toString(arr) + " на " + step + " ячейку/и вправо");
        } else {
            System.out.println("Задание 7: передвинуть массив\n" + Arrays.toString(arr) + " на " + step + " ячейку/и влево");
        }
        //задаем переменную length равной размеру массива минус 1
        int length = arr.length - 1;
        /*если число step переданное в метод положительное, то каждую ячейку массива arr
         нужно сдвинуть вправо на колличество ячеек переданных в переменной step,
         иначе если число step отрицательно, то массив arr нужно сдвинуть влево на
         колличество ячеек переданных в переменной step
         */
        if (step > 0) {
            /*запускаем цикл который отработает step раз, на сколько нужно
             сдвинуть ячейки массива
            */
            for (int j = 0; j < step; j++) {
                //в переменную tmp1 передаем значение последней ячейки, потому что будем двигать массив вправо
                int tmp1 = arr[length];
                //циклично переставяем значения ячеек: в последнюю ставим предпоследнюю итд.
                for (int i = length; i > 0; i--) {
                    arr[i] = arr[i - 1];
                }
                //в первую ячейку передаем значение переменной tmp1
                arr[0] = tmp1;
            }
        } else {
            //делаем переменную step положительным числом умножив на -1
            step *= -1;
            /*запускаем цикл который отработает step раз, на сколько нужно
             сдвинуть ячейки массива
            */
            for (int j = 0; j < step; j++) {
                //в переменную tmp1 передаем значение первой ячейки, потому что будем двигать массив влево
                int tmp1 = arr[0];
                //циклично переставяем значения ячеек: в первую ставим вторую итд.
                for (int i = 0; i < length; i++) {
                    arr[i] = arr[i + 1];
                }
                //в последнюю ячейку передаем значение переменной tmp1
                arr[length] = tmp1;
            }
        }
        //выводим массив arr который мы сдвинули на step ячеек
        System.out.println(Arrays.toString(arr));
    }
}
