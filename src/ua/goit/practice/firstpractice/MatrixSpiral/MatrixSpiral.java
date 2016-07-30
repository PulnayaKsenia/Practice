package ua.goit.practice.firstpractice.MatrixSpiral;

import java.util.Arrays;

public class MatrixSpiral {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4},
                {12, 13, 14, 5},
                {11, 16, 15, 6},
                {10, 9, 8, 7}};

        int[] matrixSpiral = new int [matrix[0].length * matrix.length];
        int row = matrix[0].length - 1;
        int column = matrix.length - 1;
        int startX = 0;
        int startY = 0;
        int count = 1;
        int index = 0;

        while (index < matrixSpiral.length) {
            if(count == 1) {
                for (int x = startX; x <= row; x++) {
                    matrixSpiral[index] = matrix[startY][x];
                    index++;
                }
                startY++;
            }
            if (count == 2) {
                for (int y = startY; y <= column; y++){
                    matrixSpiral[index] = matrix[y][row];
                    index++;
                }
                row--;
            }
            if (count == 3){
                for(int x = row; x >= startX; x--){
                    matrixSpiral[index] = matrix[column][x];
                    index++;
                }
                column--;
            }
            if (count == 4){
                for (int y = column; y >= startY; y--){
                    matrixSpiral[index] = matrix[y][startX];
                    index++;
                }
                startX++;
            }
            if (count < 4) {
                count++;
            } else {
                count = 1;
            }
        }
        System.out.println(Arrays.toString(matrixSpiral));
    }
}
