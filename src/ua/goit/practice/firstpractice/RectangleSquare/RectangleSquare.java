package ua.goit.practice.firstpractice.RectangleSquare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class RectangleSquare {
    private class Rectangle {
        int coordinateX1;
        int coordinateX2;
        int height;
        int weight;
        int square;

        public Rectangle(int coordinateX1, int height, int weight) {
            this.coordinateX1 = coordinateX1;
            this.height = height;
            this.weight = weight;
            this.coordinateX2 = coordinateX1 + weight;
            this.square = height * weight;
        }

        public int getCoordinateX1() {
            return coordinateX1;
        }

        public int getCoordinateX2() {
            return coordinateX2;
        }

        public int getHeight() {
            return height;
        }
    }

    private int calculate(int[] coordinateX, int[] height, int[] weight) {
        ArrayList<Integer> points = new ArrayList<>();
        ArrayList<Rectangle> rectangles = new ArrayList<>();

        for (int i = 0; i < coordinateX.length; i++) {
            points.add(coordinateX[i]);
            points.add(coordinateX[i] + weight[i]);
            rectangles.add(new Rectangle(coordinateX[i], height[i], weight[i]));
        }

        Set<Integer> pointsWithoutDuplicates = new HashSet<>();
        pointsWithoutDuplicates.addAll(points);
        points.clear();
        points.addAll(pointsWithoutDuplicates);

        Collections.sort(points);

        ArrayList<Rectangle> calculate = new ArrayList<>();
        for (int i = 0; i < points.size() - 1; i++) {
            int heightIntervalBetweenPointers = 0;
            int beginPoint = points.get(i);
            int endPoint = points.get(i + 1);

            for (Rectangle rectangle : rectangles) {
                if ((rectangle.getCoordinateX1() <= beginPoint) &&
                        (rectangle.getCoordinateX2() >= endPoint) &&
                        (rectangle.getHeight() > heightIntervalBetweenPointers)) {
                    heightIntervalBetweenPointers = rectangle.getHeight();
                }
            }

            if (heightIntervalBetweenPointers > 0) {
                calculate.add(new Rectangle(beginPoint, heightIntervalBetweenPointers, endPoint - beginPoint));
            }
        }

        int square = 0;
        for (Rectangle rectangle : calculate) {
            square += rectangle.square;
        }
        return square;
    }

    public static void main(String[] args) {
        RectangleSquare rectangleSquare = new RectangleSquare();
        int x[] = {0, 0, 20, 10, 5};
        int h[] = {20, 10, 30, 20, 5};
        int w[] = {10, 20, 10, 30, 40};
        int measure = rectangleSquare.calculate(x, h, w);
        System.out.println("Total rectangle's square is " + measure);
    }


}
