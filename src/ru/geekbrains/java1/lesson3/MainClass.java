package ru.geekbrains.java.lesson3;

import com.sun.org.apache.xpath.internal.SourceTree;
import jdk.nashorn.internal.ir.WhileNode;

import javax.sound.midi.Soundbank;
import javax.sound.midi.SysexMessage;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.StringJoiner;

/**
 * Created by Eduard on 31.01.2017.
 */
public class MainClass {
    public static void main(String[] args) {
        int $your_tries = 3; //колличество попыток
        gameNumberRounds($your_tries); //игра угадай число
        guessWord(); //игра угадай слово
    }

    public static void guessWord() {
        //создаем массив слов из которых компьютер будет загадывать слова
        String[] $words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random $rand = new Random(); //созадем объект класса Random
        int $x = $rand.nextInt($words.length); //вызываем метод nextInt с числом равным длинне массива $words
        String $hiddenword = $words[$x]; //присваиваем переменной слово на выбор мз массива
        Scanner sc3 = new Scanner(System.in); //объявляем новый объект класса Scanner для ввода слова
        //System.out.println($hiddenword); //печатае загаданное слово для проверки
        System.out.println("Guess word from list: " + Arrays.toString($words)); // выводим сообщение и массив слов
        String $answer = sc3.nextLine(); // считываем слова со сканера в переменную
        while (true) { //запускаем бесконечный цикл
            if ($answer.equals($hiddenword)) { //сравниваем загаданное слово и слово которое ввел пользователь
                System.out.println("Вы угадали"); //выводим сообщение если угадали и прерываем бесконечный цикл
                break;
            } else { //если не угадали

                char[] $answer_char = $answer.toCharArray(); //создаем массив с введенного пользователем слова
                char[] $hiddenword_char = $hiddenword.toCharArray(); //создаем массив с загаданного компьютером слова
                for (int i = 0; i < 15; i++) { //запускаем цикл из 15 шагов
                    if (i < $answer_char.length && i < $hiddenword_char.length) { /*если переменная i меньше длинны слов заходим выполняем
                    без этого условия в программе появляется ошибка при привышении переменной i размера массивов $answer_char и $hiddenword_char
                    */
                        if (($answer_char[i] == $hiddenword_char[i])) { //сравниваем буквы на местах
                            System.out.print($answer_char[i]); //если буквы совпадают выводим эту букву
                        } else {
                            System.out.print("#"); //если буквы не совпадают на позиции то выводим символ #
                        }
                    } else { //если переменная i больше длины любого из слов остальные символы забиваем знаком #
                        System.out.print("#");
                    }
                }
            }
            System.out.println(); //вызываем метод для перехода на новую строку в консоли
            $answer = sc3.nextLine(); //вводим новое слово со сканера в переменную answer
        }

    }

    //объявляем метод gameRounds, который будет отвечать за вызов игры, перезапуск раундов и окончание игры
    public static void gameNumberRounds(int $your_tries) {
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