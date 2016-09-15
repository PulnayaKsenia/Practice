package ua.goit.practice.firstpractice.MergerChar;

public class MergerChar {
    public static void main(String[] args) {
        char[] year = {'2', '0', '1', '6'};

        StringBuffer output = new StringBuffer();

        for (char i = 0; i < year.length; i++) {
            output.append("").append(year[i]);
        }

        System.out.println(output.toString());
    }
}
