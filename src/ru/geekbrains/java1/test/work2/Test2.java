package ru.geekbrains.java.test.work2;

import java.util.Arrays;

/**
 * Created by Eduard on 03.02.2017.
 */
public class Test2 {
    public static void main(String[] args) {
        moveArrXOR();
    }
    //Изучил метод переставления элементов массива без использования дополнительной переменной
    //Использовал только функцию XOR - использую знак ^
    public static void moveArrXOR() {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        //int y=3;
        //int x=7;
        //System.out.println("y: "+y);
        //System.out.println("x: "+x);
        /*x = x^y;
        y = x^y;
        x = x^y;*/
        /*y^=(x^=y);
        x^=y;*/
        //System.out.println("y: "+y);
        //System.out.println("x: "+x);
        //С помощью внешнего цикла сдвигаю элементы в массиве на 2 влево
        for (int j = 0; j < 2; j++) {
            //внутренни цикл сдвигает массив на 1 элемент влево
            for (int i = 0; i < 4; i++) {
                /*arr[i] = arr[i] ^ arr[i + 1];
                arr[i + 1] = arr[i] ^ arr[i + 1];
                arr[i] = arr[i] ^ arr[i + 1];
                */
            arr[i+1] ^= (arr[i]^=arr[i+1]);
            arr[i] ^= arr[i+1];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
