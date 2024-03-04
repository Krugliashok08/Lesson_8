package org.example;
import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private final HashMap<String, ArrayList<String>> items = new HashMap<>();

    public void add(String surname, String phoneNumber) {

        if (items.get(surname) != null) {
            if (!items.get(surname).contains(phoneNumber)) {
                items.get(surname).add(phoneNumber);
            }
        } else {
            ArrayList<String> arr = new ArrayList<>();
            arr.add(phoneNumber);
            items.put(surname, arr);
        }
    }

    public void get(String surname) {
        System.out.println(items.get(surname));
    }
}

