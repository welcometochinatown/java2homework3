package ru.home.java2.homework;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        /*
        1 Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
        Найти и вывести список уникальных слов,
        из которых состоит массив (дубликаты не считаем).

        Посчитать, сколько раз встречается каждое слово.

        2 Написать простой класс Телефонный Справочник,
        который хранит в себе список фамилий и телефонных номеров.
        В этот телефонный справочник с помощью метода add() можно
        добавлять записи, а с помощью метода get() искать номер телефона по фамилии.
        Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
        тогда при запросе такой фамилии должны выводиться все телефоны.
        Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес),
        взаимодействие с пользователем через консоль и т.д).
        Консоль использовать только для вывода результатов проверки телефонного справочника.
         */


        // ЗАДАНИЕ №1
        //___________________________________________________________________
        String[] words = {
                "Java", "Java", "Demo", "List", "Array",
                "Hash", "Map", "String", "Exception", "Throw",
                "Java", "Map", "Class", "Exception", "Main",
                "Sheep", "Java", "Earth", "Fire", "Door", "Linux",
                "Data", "Idea", "Bread", "Milk", "Zoo", "Animal",
                "Cat", "Dog", "Science", "Astronomy", "Star", "Cafe"
        };

        // HashMap - для поиска уникальных значений по ключу - первой букве слова в массиве words
        HashMap<Character, HashSet<String>> wordsMap = new HashMap<>();

        for (String word : words) {
            Character firstCharacter = word.charAt(0);
            if (!wordsMap.containsKey(firstCharacter)) {
                wordsMap.put(firstCharacter, new HashSet<>());
            }
            wordsMap.get(firstCharacter).add(word);
        }

        System.out.println(wordsMap);

        // HashMap - для подсчета количества одинаковых слов в массиве
        HashMap<String, Integer> wordsCount = new HashMap<>();

        for (String word : words) {
            if (!wordsCount.containsKey(word)) {
                wordsCount.put(word, 1);
            } else {
                wordsCount.put(word, wordsCount.get(word) + 1);
            }
        }

        System.out.println(wordsCount);
    }
}
