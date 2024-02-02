package org.example;


import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Jon","Snow",22);

        Gson gson = new Gson();

        String jsonString = gson.toJson(person);

        System.out.println("Преобразование объекта Person в строку JSON:\n" + jsonString);

        Person p = gson.fromJson(jsonString, Person.class);

        System.out.println("\nПреобразование строки JSON в объект Person:\n" + p.toString());
    }
}