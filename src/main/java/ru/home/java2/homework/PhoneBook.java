package ru.home.java2.homework;

import java.util.HashMap;
import java.util.HashSet;

public class PhoneBook {
    private HashMap<String, HashSet<String>> pbMap;

    public PhoneBook() {
        this.pbMap = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        // Проверка фамилии на уникальность
        if (!pbMap.containsKey(surname)) {
            pbMap.put(surname, new HashSet<>());
        }
        pbMap.get(surname).add(phoneNumber);
    }

    public HashSet<String> get(String surname) {
        // Проверка фамилии на уникальность
        if (!pbMap.containsKey(surname)) {
            return new HashSet<>();
        }
        return pbMap.get(surname);
    }
}
