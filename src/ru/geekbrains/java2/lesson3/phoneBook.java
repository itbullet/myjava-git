package ru.geekbrains.java2.lesson3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;

/**
 * Created by Eduard on 02.03.2017.
 */
public class phoneBook {
    private HashMap<String, LinkedHashSet<String>> hm;

    public phoneBook() {
        hm = new HashMap<>();
    }

    public void add(String surname, String phone) {
        if(!hm.containsKey(surname)) hm.put(surname, new LinkedHashSet<>());
        hm.get(surname).add(phone);
    }

    public void findPhoneNumber(String name) {
        if(hm.containsKey(name)) {
            System.out.println(hm.get(name));
        } else {
            System.out.println("Такой записи нет");
        }
    }
}
