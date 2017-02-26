package ru.geekbrains.java2.lesson2;

/**
 * Created by Eduard on 25.02.2017.
 */
public class MyArraySizeException extends MyException {
    private int y;
    private int x;
    public MyArraySizeException(int y) {
        super("Не правильный размер массива. В массиве не корректное колличество строк: " + y);
        this.y = y;
    }

    public MyArraySizeException(int y, int x) {
        super("Не правильный размер массива. Строка: " + y + " не правильного размера: " + x);
        this.y = y;
        this.x = x;
    }
}
