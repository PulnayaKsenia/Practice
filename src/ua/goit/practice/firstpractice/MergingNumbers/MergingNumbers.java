package ua.goit.practice.firstpractice.MergingNumbers;

public class MergingNumbers {
    private String merging(String forMerging) {
//        метод matches() проверяет строку на соответствие регулярному выражению
        if (forMerging.matches("[0-9]*")) {
            return forMerging;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        MergingNumbers mergingNumbers = new MergingNumbers();
        System.out.println(mergingNumbers.merging("89651kj"));
    }
}
