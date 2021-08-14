package ru.learn;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class CustomCalculator {

    private final static String ERROR = "Invalid data type";

    public static void main(String[] args) {

        double numberOne = parseDouble(inputNumber(1));
        double numberTwo = parseDouble(inputNumber(2));

        Calc calc = new Calc();
        System.out.println("PLUS: " + calc.plus(numberOne, numberTwo));
        System.out.println("MINUS: " + calc.minus(numberOne, numberTwo));
        System.out.println("MULTIPLY: " + calc.multiply(numberOne, numberTwo));
        System.out.println("DIVISION: " + calc.division(numberOne, numberTwo));
        System.out.println("POWER: " + calc.power(numberOne, numberTwo));
    }

    private static String inputNumber(int cnt){

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        System.out.println("Enter number " + cnt);
        if (scanner.hasNextDouble()) {
            return String.valueOf(scanner.nextDouble());
        } else if (scanner.hasNextInt()) {
            return String.valueOf(scanner.nextInt());
        } else {
            System.out.println(ERROR);
            System.exit(-1);
            return ERROR;
        }
    }
}
