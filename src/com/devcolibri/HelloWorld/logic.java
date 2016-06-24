package com.devcolibri.HelloWorld;
public class logic {
    static boolean bool = true;
    static int a = 6;
    public static void main(String[] args){
       if(a == 3){
           System.out.println("a = 3");
       }
        else if(a > 3) {
           System.out.println("a > 3");
       }else if(a < 3) {
           System.out.println("a < 3");
       }else  {
           System.out.println("Error");
       }
        switch (a){
            case 5:
                System.out.println(5);
                break;
            case 6:
                System.out.println(6);
                break;
            case 3:
                System.out.println(3);
                break;
        }
    }
}
