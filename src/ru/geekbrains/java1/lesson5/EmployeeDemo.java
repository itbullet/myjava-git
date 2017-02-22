package ru.geekbrains.java1.lesson5;

/**
 * Created by esa on 07.02.2017.
 */
public class EmployeeDemo {
    public static void main(String[] args) {
        /*
        Создаем массив из 5 сотрудников. Вначале объявляем массив объектов.
         */
        Employee[] employeesArr = new Employee[5];
        /*
        Далее для каждой ячейки массива задаем объект
         */
        employeesArr[0] = new Employee("Eduard","Shapirov","esa@unifeeder.com","+79112542748",2000,34);
        employeesArr[1] = new Employee("Anna","Bolkunova","abk@unifeeder.com","+79217698416",1000,30);
        employeesArr[2] = new Employee("Andrey","Evdokimov","aev@unifeeder.com","+79219644133",1800,54);
        employeesArr[3] = new Employee("Elena","Efremova","efr@unifeeder.com","+79217699962",1800,39);
        employeesArr[4] = new Employee("Benny","Hansen","bha@unifeeder.com","+79214121365",6000,47);
        /*
        С помощью цикла выводим информацию только о сотрудниках старше 40 лет
         */
        for (int i=0; i < employeesArr.length; i++) {
            if(employeesArr[i].getAge() > 40) {
                employeesArr[i].info();
            }
        }
    }
}
