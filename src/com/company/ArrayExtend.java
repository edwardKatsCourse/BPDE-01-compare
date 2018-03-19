package com.company;

import java.util.Scanner;

public class ArrayExtend {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //                            10
        String [] fruits = new String[0];


        String input = "";

        while (!input.equals("quit")) {
            input = scanner.nextLine();

            if (input.equals("quit")) {
                break;
            }

            //                              11
            String [] tempArray = new String[fruits.length + 1];
            for (int i = 0; i < fruits.length; i++) {
                tempArray[i] = fruits[i];
            }
            tempArray[tempArray.length - 1] = input;
            fruits = tempArray;

            System.out.println("Total fruits: " + fruits.length);
            for (int i = 0; i < fruits.length; i++) {
                System.out.print(fruits[i] + ", ");
            }
        }
    }
}
