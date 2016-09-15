package ua.goit.practice.firstpractice.MaxNumber;

import java.util.Scanner;

public class Maximum {
    private static final Scanner in = new Scanner(System.in);

    public static int maximum(int[] array) {
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