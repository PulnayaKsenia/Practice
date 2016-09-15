package ua.goit.practice.firstpractice.MatrixSnake;

import java.util.Arrays;

public class MatrixSnake {
    public static void main(String[] args) {
        int[][] matrix = {{1, 6, 7},
                {2, 5, 8},
                {3, 4, 9}};

        int[] matrixSnake = new int[matrix.length * matrix.length];
        int index = 0;

        for (int y = 0; y < matrix.length; y++) {
            if (y % 2 == 0) {
                for (int x = 0; x < matrix.length; x++) {
                    matrixSnake[index] = matrix[x][y];
                    index++;
                }
            } else {
                for (int x = matrix.length - 1; x >= 0; x--) {
                    matrixSnake[index] = matrix[x][y];
                    index++;
                }
            }
        }
        System.out.println(Arrays.toString(matrixSnake));
    }
}
