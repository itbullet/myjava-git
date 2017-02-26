package ru.geekbrains.java2.lesson2;

/**
 * Created by Eduard on 25.02.2017.
 */
public class MyArrayDataException extends MyException {
    private int y;
    private int x;
    public MyArrayDataException(int y, int x) {
        super("Не правильный формат данных в массиве в колонке: " + y + " строке: " + x);
        this.y = y;
        this.x = x;

    }
}
