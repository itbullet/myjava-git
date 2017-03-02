package ru.geekbrains.java2.lesson3;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Eduard on 02.03.2017.
 */
public class MainClass {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Home");
        al.add("Earth");
        al.add("Venera");
        al.add("Earth");
        al.add("School");
        al.add("Jupiter");
        al.add("Home");
        al.add("Earth");
        al.add("Neptun");
        al.add("Pluton");
        al.add("Mars");
        al.add("Earth");



        System.out.println(al);

        HashMap<String, Integer> hm = new HashMap();

        for (int i = 0; i < al.size(); i++) {
            hm.put(al.get(i), valueSum(al.get(i), al));
        }

        System.out.println(hm);
        System.out.println(hm.size());
    }

    public static int valueSum (String str, ArrayList al) {
        int value = 0;
        for (int i = 0; i < al.size(); i++) {
            if(al.get(i) == str) {
                value++;
            }
        }
        return value;
    }
}
