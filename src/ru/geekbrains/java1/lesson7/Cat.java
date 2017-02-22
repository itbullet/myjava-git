package ru.geekbrains.java.lesson7;

/**
 * Created by esa on 15.02.2017.
 */
public class Cat {
    private String name;
    private int appetite;
    private boolean hungry;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = false;
    }

    public void eat(Plate plate1) {
        hungry = plate1.decreaseFood(appetite);
        if (hungry) {
            System.out.println(name + " ест " + appetite + " из тарелки " + plate1.toString());
        } else {
            System.out.println(name + " не хватает еды в тарелке: " + plate1.toString());
        }
    }

    public void info() {
        System.out.println(name + " сытый: " + hungry);
    }
}
