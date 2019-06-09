package it.intera.homework3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook {

    private static Map<String, ArrayList<String>> contacts;

    public Phonebook() {
        contacts = new HashMap<>();
    }

    public void get(String surname) {

        ArrayList<String> numbers = contacts.get(surname);
        System.out.println(surname);
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

    }

    public void add(String surname, String number) {
        ArrayList<String> numberList;
        if (isNumberExist(surname)) numberList = contacts.get(surname);
        else numberList = new ArrayList<>();

        numberList.add(number);
        contacts.put(surname, numberList);
    }

    private boolean isNumberExist(String surname) {
        return contacts.get(surname) != null;
    }
}
