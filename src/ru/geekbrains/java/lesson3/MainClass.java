package ru.geekbrains.java.lesson3;

import jdk.nashorn.internal.ir.WhileNode;

import javax.sound.midi.Soundbank;
import javax.sound.midi.SysexMessage;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Eduard on 31.01.2017.
 */
public class MainClass {
    public static void main(String[] args) {
        int $your_tries = 3; //колличество попыток
        //gameRounds($your_tries);
    }

    public static void guessWord() {
        //создаем массив слов из которых компьютер будет загадывать слова
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};
    }
    //объявляем метод gameRounds, который будет отвечать за вызов игры, перезапуск раундов и окончание игры
    public static void gameRounds(int $your_tries) {
        guessNumber($your_tries); //вызываем игру
        Scanner sc2 = new Scanner(System.in); //объявляем объект класса Scanner
        //объявляем бесконечный цикл
        while (true) {
            System.out.println("Повторить игру еще раз? y/n");
            String $answer = sc2.nextLine(); //считываем ответ пользователя из объекта sc2
            if ($answer.equals("y")) { //если да то запускаем игру
                guessNumber($your_tries);
            } else { //если нет то Благодарим и прерываем цикл и выходим из программы
                System.out.println("Спасибо за игру");
                break;
            }
        }
    }
    //объявляем метод guessNumber, который отвечает за игру в угадывание чисел
    public static void guessNumber(int $try) {
        Random $rand = new Random(); //созадем объект класса Random
        int $x = $rand.nextInt(10); //вызываем метод nextInt с числом 10 для генерации чисел от 0 до 9
        System.out.println("Угадайте какое число от 0 до 9 загадал компьютер. У вас " + $try + " попытки.");
        System.out.println("Попытка " + $try + ". Введите число: ");
        Scanner sc1 = new Scanner(System.in); //объявляем новый объект класса Scanner
        $try--; //уменьшаем колличество попыток

        while (true) { //создаем бесконечный цикл
            if (sc1.hasNextInt()) { //проверяем число ли ввели в Scanner
                int $guessNumber = sc1.nextInt(); //если в сканере число то приравниваем его к переменной
                if ($guessNumber == $x && $try > 0) { //если число угаданно вовдим сообщение и прекращаем цикл
                    System.out.println("Поздравляем, вы угадали число!");
                    break;
                } else if ($guessNumber < $x && $try > 0) {
                    System.out.println("К сожалению вы не угадали. Загаданное число больше. Попытка " + $try);
                } else if ($guessNumber > $x && $try > 0) {
                    System.out.println("К сожалению вы не угадали. Загаданное число меньше Попытка " + $try);
                } else if ($try <= 0) { // если колличество попыток израсходованно то прекращаем цикл
                    System.out.println("К сожалению, вы проиграли!");
                    break;
                }
                $try--;
            }
            sc1.nextLine(); //считываем все что осталось в сканере - "очищаем его"
        }

    }
}