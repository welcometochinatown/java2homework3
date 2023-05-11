package ru.home.java2.homework;

import java.util.HashMap;
import java.util.HashSet;

public class PhoneBook {
    private HashMap<String, HashSet<String>> phoneBookMap;

    public PhoneBook() {
        this.phoneBookMap = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        // Проверка фамилии на уникальность
        if (!phoneBookMap.containsKey(surname)) {
            phoneBookMap.put(surname, new HashSet<>());
        }
        phoneBookMap.get(surname).add(phoneNumber);
    }

    public HashSet<String> get(String surname) {
        // Проверка фамилии на уникальность
        if (!phoneBookMap.containsKey(surname)) {
            return new HashSet<>();
        }
        return phoneBookMap.get(surname);
    }
}
