package ua.goit.practice.firstpractice.FinalProjectCore;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Dear user!\n " +
                "This program validates a variety of identification number to protect against accidental errors.\n " +
                "If you need to do this, please, choose kind of card:\n" +
                "BankCard,\n DiscountCard,\n IMEINumber,\n SocialSecurityCode,\n NumberOfRailwayCarriage,\n" +
                "or enter OUT for exit: ");

        for (; ; ) {
            try {
                Scanner in = new Scanner(System.in);
                String kindOfCard = in.next();

                Enum.PlasticCards card = Enum.PlasticCards.valueOf(kindOfCard);

                String data = data(in);
                int numberOfNumeral = data.length();

                switch (card) {
                    case BankCard:
                        if (numberOfNumeral == 16) {
                            // algorithm
                        } else {
                            System.out.println("Number of numerals of BankCard must be 16!");
                        }
                        break;

                    case DiscountCard:
                        if (numberOfNumeral == 15) {
                            // algorithm
                        } else {
                            System.out.println("Number of numerals of DiscountCard must be 15!");
                        }
                        break;

                    case IMEINumber:
                        if (numberOfNumeral == 15) {
                            // algorithm
                        } else {
                            System.out.println("Number of numerals of IMEINumber must be 15!");
                        }
                        break;

                    case SocialSecurityCode:
                        if (numberOfNumeral == 9) {
                            // algorithm
                        } else {
                            System.out.println("Number of numerals of SocialSecurityCode must be 9!");
                        }
                        break;

                    case NumberOfRailwayCarriage:
                        if (numberOfNumeral == 8) {
                            // algorithm
                        } else {
                            System.out.println("Number of numerals of NumberOfRailwayCarriage must be 8!");
                        }
                        break;

                    case OUT:
                        System.exit(1);
                        break;
                }

            } catch (IllegalArgumentException ex) {
                System.out.println("[Error] You enter wrong information! Please, choose kind of card!");
            } catch (InputMismatchException ex) {
                System.out.println("[Error] You enter wrong number of card! Please, enter numerals!");
            }
        }
    }

    public static String data(Scanner in) {
        System.out.println("Enter number of your card: ");
        String numberOfCard = in.next();

        return numberOfCard;
    }
}
