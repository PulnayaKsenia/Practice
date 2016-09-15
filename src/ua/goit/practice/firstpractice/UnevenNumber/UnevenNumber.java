package ua.goit.practice.firstpractice.UnevenNumber;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UnevenNumber {
    public static void main(String[] args) {
        System.out.println("Hello! This program finds first uneven number of integer in an array!\n " +
                "If you need to do this please choose ARRAY or enter OUT: ");

        Scanner in = new Scanner(System.in);
        String s = in.next();

        try {
            if (s.equals("ARRAY")) {
                unevenNumber();
            } else if (s.equals("OUT")) {
                System.exit(1);
            }
        } catch (InputMismatchException ex) {
            System.out.println("You enter all even numbers! Try again!");
        }
    }

    public static int unevenNumber() {
        Scanner in = new Scanner(System.in);

        System.out.println("Please, enter array's length: ");

        int numberOfElements = in.nextInt();
        int[] array = new int[numberOfElements];

        System.out.println("Enter array elements: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
            if (array[i] % 2 != 0) {
                return i;
            }
        }

        return -1;
    }
}
