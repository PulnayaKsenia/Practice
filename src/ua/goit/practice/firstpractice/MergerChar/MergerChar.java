package ua.goit.practice.firstpractice.MergerChar;

public class MergerChar {
    public static void main(String[] args) {
        char[] year = {'2', '0', '1', '6'};
        String split = "";

        for (char i = 0; i < year.length; i++) {
            split += year[i];
        }

        Integer yearInt = Integer.parseInt(split);
        System.out.println(yearInt);
    }
}
