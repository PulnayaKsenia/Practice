package ua.goit.practice.firstpractice.Base36;

public class Base36 {
    public static String summingBase36(String symbols) {
        String symbolsForBase36 = "0123456789abcdefghijklmnopqrstuvwxyz";
        int numberOfSymbols = 36;
        String[] split = symbols.split(",");
        long sumOfNumber = 0;
        long count = 0;

        for (String symbol : split) {
            for (char symbolChar : symbol.toCharArray()) {
                count += symbolsForBase36.indexOf(symbolChar);
                System.out.println(symbolsForBase36.indexOf(symbolChar));
                count += numberOfSymbols;
            }
            sumOfNumber += count/numberOfSymbols;
            count = 0;
        }
        return Long.toString(sumOfNumber, numberOfSymbols);
    }

    public static void main(String[] args) {
        String symbolsForSum = "a12, 89z";
        System.out.println("Result after summing '" + symbolsForSum + "': " + summingBase36(symbolsForSum));
    }
}

