package ru.geekbrains.java2.lesson2;

/**
 * Created by Eduard on 25.02.2017.
 */
public class MainClass {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException{
        String[][] strArr = new String[][]{
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1", "3"},
                {"1", "1", "c", "1"},
                {"1", "1", "1", "1"}};
        myFunctions.sumArr(strArr);
    }
}
