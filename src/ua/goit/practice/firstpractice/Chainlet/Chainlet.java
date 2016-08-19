package ua.goit.practice.firstpractice.Chainlet;

import java.util.HashMap;
import java.util.Map;

public class Chainlet {
    private int whiteLength = 1;
    private int yellowLength = 2;
    private int redLength = 3;
    private Map<Integer, Integer> colorCount = new HashMap<>();

    public int calculate(int lengthN) {
        int numberOfWays;
        if (lengthN <= 2) return lengthN;
        if (lengthN == 3) return lengthN + 1;

        int white = colorCount.containsKey(lengthN - whiteLength) ? colorCount.get(lengthN - whiteLength) : calculate(lengthN - whiteLength);
        int yellow = colorCount.containsKey(lengthN - yellowLength) ? colorCount.get(lengthN - yellowLength) : calculate(lengthN - yellowLength);
        int red = colorCount.containsKey(lengthN - redLength) ? colorCount.get(lengthN - redLength) : calculate(lengthN - redLength);

        colorCount.put(lengthN - whiteLength, white);
        colorCount.put(lengthN - yellowLength, yellow);
        colorCount.put(lengthN - redLength, red);

        numberOfWays = white + yellow + red;

        return numberOfWays;
    }

    public static void main(String[] args) {
        Chainlet chainletNew = new Chainlet();
        System.out.println("Number of ways for gather chainlet: " + chainletNew.calculate(3));
    }
}
