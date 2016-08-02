package ua.goit.practice.firstpractice.Average;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        System.out.println("This program calculate average arithmetic of numbers!");

        try {
            Scanner in = new Scanner(System.in);

            System.out.println("Enter first number to calculate: ");
            int firstNumber = in.nextInt();

            System.out.println("Enter second number to calculate: ");
            int secondNumber = in.nextInt();

            int result = (firstNumber + secondNumber) / 2;
            System.out.println("Average arithmetic number: " + result);

        } catch (InputMismatchException ex) {
            System.out.println("[Error] You enter wrong data. Must be number!");
        }
    }
}
