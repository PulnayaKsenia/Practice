package ua.goit.practice.firstpractice.MaxNumber;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("HELLO! This program searches maximum value in an array of integers!\n" +
                "If you need to do this please choose ARRAY or enter OUT: ");
        String s = in.next();

        try {
            if (s.equals("ARRAY")) {
                int[] array = createArray();
                Maximum.maximum(array);

            } else if (s.equals("OUT")) {
                System.exit(1);
            }
        } catch (InputMismatchException ex) {
            System.out.println("You enter wrong value! Must be integer number! Try again!");
        }
    }

    private static int[] createArray() {
        System.out.println("Please, enter array's length: ");
        int numberOfElements = in.nextInt();

        System.out.println("Enter array elements: ");
        int[] array = new int[numberOfElements];

        return array;
    }
}

