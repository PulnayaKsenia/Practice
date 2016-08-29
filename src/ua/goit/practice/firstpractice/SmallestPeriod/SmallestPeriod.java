package ua.goit.practice.firstpractice.SmallestPeriod;

public class SmallestPeriod {
    public static String findSmallestPeriod(String input) {
        int position;
        int period;
        for (position = 1; position <= input.length(); position++) {
            for (period = position; period < input.length(); period++) {
                if (input.charAt(period) != input.charAt(period % position)) {
                    break;
                }
            }
            if (period == input.length()) {
                break;
            }
        }
        return input.substring(0, position);
    }

    public static void main(String[] args) {
        System.out.println(findSmallestPeriod("ksuksuksuksuksuksuksu"));
    }
}
