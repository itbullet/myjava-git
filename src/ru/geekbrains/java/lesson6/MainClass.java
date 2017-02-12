package ru.geekbrains.java.lesson6;

import java.util.Random;

/**
 * Created by Eduard on 12.02.2017.
 */
public class MainClass {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Cat cat1 = new Cat();

        int dog1_length = 300;
        double dog1_height = 0.4;
        int dog1_swim_length = 9;

        int dog2_length = 300;
        double dog2_height = 0.4;
        int dog2_swim_length = 9;

        int cat1_length = 300;
        double cat1_height = 0.4;
        int cat1_swim_length = 9;

        System.out.println("Собака1 может максимально пробежать: " + dog1.getMax_length() + " проплыть: " + dog1.getMax_length_swim() + " подпрыгнуть: " + dog1.getMax_height());
        System.out.println(dog1_length + " " + dog1.run(dog1_length));
        System.out.println(dog1_swim_length + " " + dog1.swim(dog1_swim_length));
        System.out.println(dog1_height + " " + dog1.jump(dog1_height));
        System.out.println("Собака2 может максимально пробежать: " + dog2.getMax_length() + " проплыть: " + dog2.getMax_length_swim() + " подпрыгнуть: " + dog2.getMax_height());
        System.out.println(dog2_length + " " + dog2.run(dog2_length));
        System.out.println(dog2_swim_length + " " + dog2.swim(dog1_swim_length));
        System.out.println(dog2_height + " " + dog2.jump(dog2_height));
        System.out.println("Кошка1 может максимально пробежать: " + cat1.getMax_length() + " проплыть: " + cat1.getMax_length_swim() + " подпрыгнуть: " + cat1.getMax_height());
        System.out.println(cat1_length + " " + cat1.run(cat1_length));
        System.out.println(cat1_swim_length + " " + cat1.swim(cat1_swim_length));
        System.out.println(cat1_height + " " + cat1.jump(cat1_height));

    }
}
