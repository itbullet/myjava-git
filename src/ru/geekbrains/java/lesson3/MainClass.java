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
        int $your_tries = 4;
        gameRounds($your_tries);
    }

    public static void gameRounds(int $your_tries){
        guessNumber($your_tries);
        Scanner sc2 = new Scanner(System.in);
        while(true) {
            System.out.println("Повторить игру еще раз? y/n");
            String $answer = sc2.nextLine();
            if ($answer.equals("y")) {
                guessNumber($your_tries);
            } else {
                System.out.println("Спасибо за игру");
                break;
            }
        }
    }

    public static void guessNumber(int $try) {
        Random $rand = new Random();
        int $x = $rand.nextInt(10);
        System.out.println("Угадайте какое число от 0 до 9 загадал компьютер. У вас " + $try + " попытки.");
        System.out.println("Попытка " + $try + ". Введите число: ");
        Scanner sc1 = new Scanner(System.in);
        $try--;

        while (true) {
            if (sc1.hasNextInt()) {
                int $guessNumber = sc1.nextInt();
                if ($guessNumber == $x && $try > 0) {
                    System.out.println("Поздравляем, вы угадали число!");
                    break;
                } else if ($guessNumber < $x && $try > 0) {
                    System.out.println("К сожалению вы не угадали. Загаданное число больше. Попытка " + $try);
                } else if ($guessNumber > $x && $try > 0) {
                    System.out.println("К сожалению вы не угадали. Загаданное число меньше Попытка " + $try);
                } else if ($try <= 0) {
                    System.out.println("К сожалению, вы проиграли!");
                    break;
                }
                $try--;
            }
            sc1.nextLine();
        }

    }
}