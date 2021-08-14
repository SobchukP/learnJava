package ru.learn;

public class Calc {

    public final static String ERROR_DIVISION = "Invalid Data: Division by zero";

    public double plus(double a, double b){
        return (a+b);
    }

    public double minus(double a, double b){
        return (a-b);
    }

    public double multiply(double a, double b){
        return (a*b);
    }

    public String division(double a, double b){
        return inspectValidOperators(b) ? String.valueOf(a/b) : ERROR_DIVISION;
    }

    public double power(double a, double b){
        return Math.pow(a,b);
    }

    private boolean inspectValidOperators(double delimiter){
        return delimiter != 0;
    }
}
