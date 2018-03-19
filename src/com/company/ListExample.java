package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        List fruits = new ArrayList<>();
        List<String> fruits = new ArrayList<>();
        String input = "";

        while (!input.equals("quit")) {
            input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }
            fruits.add(input);
        }

        System.out.println("Total fruits: " + fruits.size());
        System.out.println(fruits);
    }

    private static void listDemo() {
        //int -> Integer
        //double -> Double
        //float -> Float
        //char -> Character

        //String [] list = new String[10];
        //String [] list = new String[20];
        //String [] list = new String[40];
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("pineapple");
        list.add("mango");

        System.out.println(list);
        System.out.println(list.get(3));

        System.out.println(list.remove(3));

        System.out.println(list);

        List<String> list_2 = new ArrayList<>();
        list_2.add("cucumber");
        list_2.add("potato");
        list_2.add("redis");

        list_2.addAll(list);
        System.out.println(list_2);

        list.set(0, "pomegranate");

        System.out.println(list);
    }
}
