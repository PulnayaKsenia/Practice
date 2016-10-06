package ua.goit.practice.firstpractice.Base36;

public class Base36 {
    private final static String symbolsForBase36 = "0123456789abcdefghijklmnopqrstuvwxyz";
    private final static String symbolsForBase36Uppercase = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String summingBase36(String symbols) {
        int numberOfSymbols = 36;
        String[] split = symbols.split(",");
        long sumOfNumber = 0;
        long count = 0;

        for (String symbol : split) {
            for (char symbolChar : symbol.toCharArray()) {
                for (int i = 0; i < numberOfSymbols; i++) {
                    if (symbolChar == symbolsForBase36.charAt(i) || symbolChar == symbolsForBase36Uppercase.charAt(i)) {
                        count +=i;
                        break;
                    }
                }
                count *= numberOfSymbols;
            }
            sumOfNumber += count/numberOfSymbols;
            count = 0;
        }
        return Long.toString(sumOfNumber, numberOfSymbols);
    }

    public static void main(String[] args) {
        String symbolsForSum = "Z, 1";
        System.out.println("Result after summing " + symbolsForSum + ": " + summingBase36(symbolsForSum));
    }
}

