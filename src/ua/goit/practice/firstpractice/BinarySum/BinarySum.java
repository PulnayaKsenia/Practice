package ua.goit.practice.firstpractice.BinarySum;

public class BinarySum {
    public static String summing(String first, String second) {
        int firstNumber = Integer.parseInt(first);
        int secondNumber = Integer.parseInt(second);

        String result = Integer.toBinaryString(firstNumber + secondNumber);
        return result;
    }

    public static void main(String[] args) {
        String first = "1111";
        String second = "1001";

        System.out.println("Result after summing '" + first + "' and '" + second + "' binary numbers: " +
                summing(first, second));
    }
}
