package ua.goit.practice.firstpractice.LetterToNumber;

public class LetterToNumber {
    public static String convert(String forConvert) {
        String[] letter = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        String[] number = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        String afterConvert = forConvert;
        for (int i = 0; i < letter.length; i++) {
//  метод replaceAll() заменяет все найденые соответствия
            afterConvert = afterConvert.replaceAll(letter[i], number[i]);
        }
        return afterConvert;
    }

    public static void main(String[] args) {
        String forConvert = "beaebjjc";
        System.out.println("'" + forConvert + "'" + " after convert: " + convert(forConvert));
    }
}
