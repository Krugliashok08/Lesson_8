package org.example;

import java.util.ArrayList;
import java.util.HashMap;


public class Main {

    private static final HashMap<String,Integer> hashMap = new HashMap<>();
    public static void main (String []args){

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("January");
        arrayList.add("February");
        arrayList.add("March");
        arrayList.add("April");
        arrayList.add("May");
        arrayList.add("January");
        arrayList.add("February");
        arrayList.remove(5);
        arrayList.remove(5);
        System.out.println(arrayList);

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