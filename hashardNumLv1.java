package com.sj.study.programers.Random;

public class hashardNumLv1 {

    public static boolean solution(int x){
        int[] arr = new int[2];
        String temp = Integer.toString(x);
        String temp1 = temp.substring(0,1);
        String temp2 = temp.substring(1,2);

        int num1 = Integer.parseInt(temp1);
        int num2 = Integer.parseInt(temp2);

        int sum = num1 + num2;
        System.out.println(sum + "두 수 합");

        if(x % sum == 0) return true;
        return false;
    }

    public static boolean solution2(int x)
    {
        int temp = x;
        int sum = 0;

        while (temp >= 10)
        {
            sum += temp % 10;
            System.out.println((temp % 100));
            temp /= 10;
        }
        System.out.println(sum +"합1");

        sum += temp;
        System.out.println(sum +"합");

        return x % sum == 0;
    }


    public static void main(String[] args) {
        System.out.println(solution2(101));
    }

}
