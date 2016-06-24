package com.devcolibri;

public class Mass {

    static int[] nums = new int[10];
    static String[] beans = new String[3];

    public static void main (String[] args){
    nums[0] = 2;
    nums[1] = 5;
    nums[2] = 7;
    nums[3] = 1;
    nums[4] = 0;
    nums[5] = -7;
    nums[6] = 9;
    nums[7] = 10;
    nums[8] = 3;
    nums[9] = 8;
        beans[0] = "Hello ";
        beans[1] = "My ";
        beans[2] = "Dear! ";
        for(int i=0;i<nums.length;i++)
            System.out.println(i+": " + nums[i]);
        for(int i=0;i<beans.length;i++)
            System.out.print(beans[i]);
    }
}
