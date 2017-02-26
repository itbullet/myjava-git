package ru.geekbrains.java2.lesson2;

/**
 * Created by Eduard on 25.02.2017.
 */
public class myFunctions {
    public static void sumArr(String[][] strArr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        //суммируем все элементы массива и ловим ошибки  MyArraySizeException, MyArrayDataException
        if (strArr.length != 4) throw new MyArraySizeException(strArr.length);
        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < strArr[i].length; j++) {
                if(strArr[i].length != 4) throw new MyArraySizeException(i, strArr[i].length);
                try {
                    sum += Integer.parseInt(strArr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(j, i);
                }
            }
        }
        //Если не было ошибок печатаем массив
        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < strArr[i].length; j++) {
                System.out.print(strArr[i][j]);
            }
            System.out.println("");
        }

        System.out.println("Сумма всех элементов массива: " + sum);


    }
}
