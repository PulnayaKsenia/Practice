package ua.goit.practice.firstpractice.PositiveAverage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PositiveAverage {
    public static void main(String[] args) {
        System.out.println("This program calculate average arithmetic of positive numbers!");

        try {
            Scanner in = new Scanner(System.in);

            System.out.println("Enter first number to calculate: ");
            int firstNumber = in.nextInt();

            System.out.println("Enter second number to calculate: ");
            int secondNumber = in.nextInt();

            if (firstNumber > 0 && secondNumber > 0) {
                int result = (firstNumber + secondNumber)/2;
                System.out.println("Average arithmetic number: " + result);
            } else {
                System.out.println("You enter negative number, must be positive! Try again!");
            }
        } catch (InputMismatchException ex) {
            System.out.println("[Error] You enter wrong data. Must be number!");
        }
    }
}
