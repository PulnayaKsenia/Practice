package ua.goit.practice.firstpractice.MyCALCULATOR;

import java.util.LinkedList;

public class Calculator {
    private static char addition = '+';
    private static char subtraction = '-';
    private static char multiplication = '*';
    private static char division = '/';

    public static boolean operators (char operator){
        return operator == addition || operator == subtraction ||
                operator == multiplication || operator == division;
    }

    public static int priority (char operators) {
        if (operators == multiplication || operators == division) {
            return 1;
        } else if (operators == addition || operators == subtraction) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void count(LinkedList<Integer> numbers, char operators) {
        int firstValue = numbers.removeLast();
        int secondValue = numbers.removeLast();

        switch (operators) {
            case '+' :
                numbers.add(firstValue + secondValue);
                break;
            case '-' :
                numbers.add(secondValue - firstValue);
                break;
            case '*':
                numbers.add(firstValue*secondValue);
                break;
            case '/':
                numbers.add(secondValue/firstValue);
                break;
            default:
                System.out.println("Something went wrong!");
        }
    }

    public static int returnValue(String function) {
        LinkedList<Integer> numbers = new LinkedList<>();
        LinkedList<Character> operators = new LinkedList<>();

        for (int i= 0; i < function.length(); i++) {
            char bracket = function.charAt(i);
            if (bracket == '(') {
                operators.add('(');
            } else if (bracket == ')'){
                while (operators.getLast() != '(') {
                    count(numbers, operators.removeLast());
                }
                operators.removeLast();
            } else if (operators(bracket)) {
                while (!operators.isEmpty() &&
                        priority(operators.getLast()) >= priority(bracket)) {
                    count(numbers, operators.removeLast());
                }
                operators.add(bracket);
            } else {
                String operand = "";
                while (i < function.length() &&
                        Character.isDigit(function.charAt(i))) {
                    operand += function.charAt(i++);
                }
                i--;
                numbers.add(Integer.parseInt(operand));
            }
        }
        while (!operators.isEmpty()) {
            count(numbers, operators.removeLast());
        }
        return numbers.get(0);
    }

    public static void main(String[] args) {
        int forCount = returnValue("(89-15)*(25+54)/25");
        System.out.println(forCount);
    }
}

