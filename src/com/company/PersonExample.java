package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class PersonExample {

    static List<Person> personList = new ArrayList<>();

    public static void main(String[] args) {
        String input = "";

        while (!input.equals("quit")) {

            Person person = new Person(
                    personList.size() + 1,
                    readInput("First name: "),
                    readInput("Last name: "),
                    new Date());

            personList.add(person);

            input = readInput("Create another one? ");
        }

        System.out.println("Total persons: " + personList.size());

        //for loop
//        for (int i = 0; i <; i++) {
//
//        }

        //foreach loop
        for (Person person : personList) {
            System.out.println(person);
        }
    }

    private static String readInput(String prefix) {
        System.out.println(prefix + "\n");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
