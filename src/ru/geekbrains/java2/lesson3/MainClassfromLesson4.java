package ru.geekbrains.java2.lesson3;

import java.util.HashMap;

/**
 * Created by Eduard on 02.03.2017.
 */
public class MainClassfromLesson4 {
    public static void main(String[] args) {
        String[] arr = {"Mercury", "Earth", "Jupiter", "Earth", "Venus", "Venus", "Earth"};
        HashMap<String, Integer> hm = new HashMap<>();
        /*for(String o: arr){
            if(!hm.containsKey(o)) {
                hm.put(o, 1);
            } else {
                hm.put(o, hm.get(o) + 1);
            }

        }*/

        for(String o: arr){
            hm.put(o, hm.getOrDefault(o, 0) + 1);
        }

        System.out.println(hm);
        System.out.println(hm.keySet());

        //////////////////////////////////////////////////

        phoneBook book = new phoneBook();

        book.add("Shapirov", "9112542748");
        book.add("Vasiliev", "9214567825");
        book.add("Alekhin", "9219310442");
        book.add("Shapirov", "4040782");
        book.add("Vasiliev", "4040759");
        book.add("Hansen", "4040730");

        book.findPhoneNumber("Shapirov");
        book.findPhoneNumber("Hansen");
        book.findPhoneNumber("Alekhin");
        book.findPhoneNumber("Vasiliev");
        book.findPhoneNumber("Zverev");


    }
}
