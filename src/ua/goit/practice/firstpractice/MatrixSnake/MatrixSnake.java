package ua.goit.practice.firstpractice.MatrixSnake;

import java.util.Arrays;

public class MatrixSnake {
    public static void main(String[] args) {
        int[][] matrix = {{1, 8, 9, 16},
                {2, 7, 10, 15},
                {3, 6, 11, 14},
                {4, 5, 12, 13}};

        int [] matrixSnake = new int[matrix.length * matrix.length];
        int index = 0;

        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix.length; x++) {
                matrixSnake[index] = matrix[x][y];
                index++;
            }
            y++;

            for (int x = matrix.length - 1; x >=0; x--) {
                matrixSnake[index] = matrix[x][y];
                index++;
            }
        }
        System.out.println(Arrays.toString(matrixSnake));
    }
}
