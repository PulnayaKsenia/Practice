package ua.goit.practice.firstpractice.CountWorlds;

public class CountWorlds {
    private static String sonnet88 = "When thou shalt be disposed to set me light,\n" +
            "And place my merit in the eye of scorn,\n" +
            "Upon thy side, against my self I'll fight,\n" +
            "And prove thee virtuous, though thou art forsworn:\n" +
            "With mine own weakness being best acquainted,\n" +
            "Upon thy part I can set down a story\n" +
            "Of faults concealed, wherein I am attainted:\n" +
            "That thou in losing me, shalt win much glory:\n" +
            "And I by this will be a gainer too,\n" +
            "For bending all my loving thoughts on thee,\n" +
            "The injuries that to my self I do,\n" +
            "Doing thee vantage, double-vantage me.\n" +
            "Such is my love, to thee I so belong,\n" +
            "That for thy right, my self will bear all wrong.";

    public static int calculator() {
//        метод trim() убирает из исходной строки все ведущие и замыкающие пробелы
        String[] words = sonnet88.trim().split("\\s+");
        int worldNumber = words.length;

        return worldNumber;
    }

    public static void main(String[] args) {
        System.out.println("Number of worlds in Shakespeare's sonnet #88: " + calculator());
    }
}
