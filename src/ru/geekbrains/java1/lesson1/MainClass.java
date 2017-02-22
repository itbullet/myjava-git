package ru.geekbrains.java.lesson1;

/**
 * Created by esa on 24.01.2017.
 */
public class MainClass {
    //Задание 1: создаем пустой проект и прописываем метод main
    public static void main(String[] args) {
    //Задание 2: создаем 8 переменных примитивного типа и инициализируем их тип
        byte a = 10;
        short b = 15;
        int c = -10;
        long d = 45L;
        float e = 50.6f;
        double f = -60.2121;
        boolean g = true;
        char h = 'X';
        int year = 2016;
        //вызов метода equationCalc
        System.out.println(equationCalc( a, b, c, d));
        //вызов метода chkSumBtwn10and20
        System.out.println(chkSumBtwn10and20( a, b));
        //вызов метода chkPositiveInt
        chkPositiveInt( c);
        //вызов метода chkNegativeInt
        System.out.println(chkNegativeInt( c));
        //вызов метода helloNameStr
        helloNameStr("Эдуард");
        //вызов метода chkLeapYear
        chkLeapYear(year);

    }
    //Задание 3: метод возвращающий результат выражения a*(b+(c/d))
    public static double equationCalc (float a, float b, float c, float d) {

        return a*(b+(c/d));

    }
    //Задание 4: метод возвращающий true если сумма лежит между 10 и 20
    public static boolean chkSumBtwn10and20 (int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }
    //Задание 5: метод выводит результат - положительное ли целое число
    public static void chkPositiveInt (int c) {
        if (c >= 0) {
            System.out.println(c + " это положительное число");
        } else {
            System.out.println(c + " это отрицательное число");
        }
    }
    //Задание 6: метод проверяющий отрицательное ли целое число - возвращает true или false
    public static boolean chkNegativeInt (int c) {
        if (c < 0) {
            return true;
        } else {
            return false;
        }
    }
    //Задание 7: метод который приветствует того, чье имя было передано через параметр str1
    public static void helloNameStr (String str1) {
        System.out.println("Привет, " + str1 + "!");
    }
    //Задание 8: метод который проверяет является ли год високосным
    public static void chkLeapYear (int year) {
        //вычисляем остаток деление year на 4
        int sign1 = year%4;
        //вычисляем остаток деление year на 100
        int sign2 = year%100;
        //вычисляем остаток деление year на 400
        int sign3 = year%400;
        /*если остаток деления year на 4 равен 0 И year на 100 не равен 0
        ИЛИ остаток деления year на 400 равен 0 тогда год високосный
        в другом случае год не високосный
         */
        if ((sign1 == 0 && sign2 != 0) || sign3 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }
}
