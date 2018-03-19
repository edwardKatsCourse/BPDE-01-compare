package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class ComparisonPersonExample {

    static List<Person> personList = new ArrayList<>();

    public static void main(String[] args) {
        initializePersons();

//        Collections.sort(strings);
        Collections.sort(personList);
        System.out.println(personList);

        //.equals(Object o)
        //==

        System.out.println("Equals vs ==");
        String s1 = new String("abc");
        String s2 = "abc";
        String s3 = new String("abc");
        String s4 = "abc";

        System.out.println(s1 == "abc");
        System.out.println(s2 == "abc");
        System.out.println(s3.equals("abc"));
        System.out.println(s4.equals("abc"));

        System.out.println("Integer == vs .equals()");
        Integer i1 = new Integer(0);
        Integer i2 = 0;
        Integer i3 = new Integer(0);
        Integer i4 = 0;

        System.out.println(i1 == 0);
        System.out.println(i2 == 0);
        System.out.println(i3.equals(0));
        System.out.println(i4.equals(0));





    }

    private static void initializePersons() {
        personList.add(new Person(
                -100,
                "c",
                "c",
                new Date()));

        personList.add(new Person(
                personList.size()+1,
                "a",
                "a",
                new Date()));

        personList.add(new Person(
                personList.size()+1,
                "b",
                "b",
                new Date()));

        personList.add(new Person(
                personList.size()+1,
                "c",
                "c",
                new Date()));
    }
}
