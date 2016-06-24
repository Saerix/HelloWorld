package com.devcolibri.HelloWorld;


public class Cycles {
    public static void main(String[] args) {
        int i = 0;
        int b = 23;
        for (i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("Now i is " + i);
        while (b > 5){
            b--;
        }
        System.out.println("Now b is " + b);
        /*Разбиваем строку по словам */
        String[] st = "Hello World!".split(" ");
        for(String s : st){
            System.out.println(s);
        }
    }


}
