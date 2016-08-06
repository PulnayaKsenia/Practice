package ua.goit.practice.firstpractice.InsertZero;

public class InsertZero {
    public static int insert(int number, int position) {
        String binary = Integer.toBinaryString(number);
        char[] bits = binary.toCharArray();

        if ((position >= 1) && (position <= bits.length)) {
            bits[bits.length - position] = '0';
        }
        if (number < 0) {
            bits[0] = '0';
            binary = String.valueOf(bits);
            return Integer.parseInt(binary, 2)*(-1)-2;
        }
        binary = String.valueOf(bits);
        return Integer.parseInt(binary, 2);
    }

    public static void main(String[] args) {
        int numberInDecimalSystem = 31;
        String numberInBinarySystem = Integer.toBinaryString(numberInDecimalSystem);
        int positionForInsert = 5;

        System.out.println("Number in decimal system '" + numberInDecimalSystem + "' in binary system: '" +
                numberInBinarySystem + "'.\nAfter changing " + positionForInsert + " position of zero becomes " +
                insert(numberInDecimalSystem, positionForInsert) + " in decimal system.");
    }
}
