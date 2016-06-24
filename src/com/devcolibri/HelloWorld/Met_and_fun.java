package com.devcolibri.HelloWorld;

public class Met_and_fun {
    public static void main (String[] args){
        int val = calcSum(3,9); //Обращаемся к методу calcSum , передаем ему числа 3 и 9, и присваиваем переменной val то, что он нам вернул
        System.out.println(val);
        int rec = calcRec(1,0);
        System.out.println(rec);
    }
    static int calcSum(int a, int b){ //Сам метод
    int k = a + b;
        //Метод отработал
        return k;
        //Метод вернул нам переменную sum
    }static int calcRec(int a, int b){
    int k = a + b;
        if(k == 2)
        {
            k = calcRec (5,15);
        }

        return k;

    }


}
