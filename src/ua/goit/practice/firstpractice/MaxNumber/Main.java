package ua.goit.practice.firstpractice.MaxNumber;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("HELLO! This program searches maximum value in an array of integers!\n" +
                "If you need to do this, please, choose ARRAY or enter OUT: ");

        Scanner in = new Scanner(System.in);
        String s = in.next();

        try {
            if (s.equals("ARRAY")) {
                Maximum maximum = new Maximum();
                maximum.maximum();

            } else if (s.equals("OUT")) {
                System.exit(1);
            }
        } catch (InputMismatchException ex) {
            System.out.println("You enter wrong value! Must be integer number! Try again!");
        }
    }
}

