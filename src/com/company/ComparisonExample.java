package com.company;

import java.util.*;

public class ComparisonExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("d");
        list.add("c");
        list.add("z");
        list.add("g");
        list.add("o");
        list.add("b");


        System.out.print("List before sorting: ");
        System.out.println(list);
        Collections.sort(list);
        System.out.print("List after sorting: ");
        System.out.println(list);


        String [] array = new String[] {"a", "d", "c", "z", "g", "o", "b"};
        System.out.print("Array before sorting: ");
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.print("Array after sorting:  ");
        System.out.println(Arrays.toString(array));
    }

    private static void printSet() {
        Set<String> set = new HashSet<>();

        set.add("a");
        set.add("a");
        set.add("a");
        set.add("a");
        set.add("a");
        set.add("a");
        set.add("b");
        set.add("c");

        System.out.print("Set: ");
        System.out.println(set);
    }

    private static void printMap() {
        Map<String, String> map = new HashMap<>();

        map.put("a", "same value");
        map.put("a", "same value");
        map.put("a", "same value");
        map.put("a", "same value");
        map.put("b", "same value");
        map.put("b", "same value");
        map.put("b", "same value");
        map.put("c", "same value");

        System.out.print("Map: ");
        System.out.println(map);
    }
}
