package com.devcolibri;

public class Math_ele {
    public static void main(String[] args) {
        int a = 7;
        double b = 5.4;
        double c = a * b - (a / b);
        double finalValue = Math.round( c * 100.0 ) / 100.0;
        System.out.println(a + b);
        System.out.println(finalValue);
        System.out.println(Math.cos(finalValue));

    }
}
