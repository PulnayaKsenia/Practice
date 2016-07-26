package ua.goit.practice.firstpractice.SumNumeral;

public class SumNumeral {
    public static void main(String[] args) {
        int dateOfBirthday = 14041992;
        int i = 0;

        while (dateOfBirthday > 0) {
            i += dateOfBirthday % 10;
            dateOfBirthday /= 10;
        }

        System.out.println(i);
    }
}
