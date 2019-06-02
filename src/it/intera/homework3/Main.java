package it.intera.homework3;

import java.util.*;

public class Main {

    private static List<String> words;
    private static Map<String,Integer> duplicates;

    public static void main(String[] args) {

        Phonebook pb = new Phonebook();
        pb.add("Vasiliev", "+73456543578");
        pb.add("Vasiliev", "+73456543578");
        pb.add("Petrov", "+73456543578");
        pb.add("Osipov", "+73456543578");
        pb.add("Osipov", "+73456543578");
        pb.add("Osipov", "+73456543578");

        pb.get("Osipov");

        generateList();
        generateListInfo();
        System.out.println(duplicates.entrySet());
    }

    private static void generateListInfo() {
        duplicates = new HashMap<>();
        for (String word: words) {
            if (duplicates.get(word) == null) duplicates.put(word,1);
            else duplicates.put(word, duplicates.get(word) + 1);
        }
    }

    private static void generateList() {
        words = new ArrayList<>();
        words.add("Petya");
        words.add("Vasya");
        words.add("Dima");
        words.add("Pasha");
        words.add("Andrey");
        words.add("Andrey");
        words.add("Andrey");
        words.add("Sergey");
        words.add("Sergey");
        words.add("Dima");
        words.add("Ivan");
        words.add("Ivan");
        words.add("Pasha");
        words.add("Anya");
        words.add("Ira");
    }
}
