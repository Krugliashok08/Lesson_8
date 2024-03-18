package org.example;

import java.util.*;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {

        String[] wordsArray = {"January", "February", "March", "April", "May", "January",

                "February"};

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : wordsArray) {

            if (wordCount.containsKey(word)) {

                wordCount.put(word, wordCount.get(word) + 1);

            } else {

                wordCount.put(word, 1);

            }

        }

        System.out.println("Уникальные слова");

        for (String word : wordCount.keySet()) {

            System.out.println(word + " - " + wordCount.get(word));

        }

            System.out.println();

            PhoneBook PB = new PhoneBook();
            PB.add("Алексеев", "+7 (911) 111-11-11");
            PB.add("Богданов", "+7 (912) 222-22-22");
            PB.add("Ветров", "+7 (913) 333-33-33");
            PB.add("Горшенев", "+7 (914) 444-44-44");
            PB.add("Алексеев", "+7 (915) 555-55-55");
            PB.add("Ветров", "+7 (916) 666-66-66");
            PB.add("Желудев", "+7 (917) 777-77-77");
            PB.add("Зайцев", "+7 (918) 888-88-88");
            // запрашиваем результаты
            PB.get("Алексеев");
            PB.get("Ветров");
            PB.get("Желудев");
        }
    }
