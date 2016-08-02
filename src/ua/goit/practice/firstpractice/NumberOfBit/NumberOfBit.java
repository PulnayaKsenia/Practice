package ua.goit.practice.firstpractice.NumberOfBit;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberOfBit {
    public static void main(String[] args) {
        System.out.println("This program calculate numbers of bit in number!");

        try {
            Scanner in = new Scanner(System.in);

            System.out.println("Enter your number: ");
            int number = in.nextInt();

            int result = 0;
            String binary = Integer.toBinaryString(number);

            for (int i = 0; i < binary.length(); i++) {
                if (binary.charAt(i) == '1') {
                    result++;
                }
            }
            System.out.println("Numbers of bit in " + number + ": " + result);
        } catch (InputMismatchException ex){
            System.out.println("[Error] You enter wrong data. Must be number!");
        }
    }
}
