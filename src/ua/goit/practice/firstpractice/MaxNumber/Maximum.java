package ua.goit.practice.firstpractice.MaxNumber;

import java.util.Scanner;

public class Maximum {
    public static int maximum() {
        Scanner in = new Scanner(System.in);

        System.out.println("Please, enter array's length: ");

        int numberOfElements = in.nextInt();
        int[] array = new int[numberOfElements];

        System.out.println("Enter array elements: ");

        int max = array[0];

            for (int i = 0; i < array.length; i++) {
                array[i] = in.nextInt();
                if (max < array[i]) {
                    max = array[i];
                }
            }
        System.out.println(max);

        return max;
    }

}