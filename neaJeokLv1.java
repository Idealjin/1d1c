package com.sj.study.programers.Random;

public class neaJeokLv1 {

    public static int solution(int[] a, int[] b) {
        int answer = 0;
         //[1,2,3,4]		[-3,-1,0,2]	 3
        //a와 b의 내적은 1*(-3) + 2*(-1) + 3*0 + 4*2 = 3 입니다.


        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }


        return answer;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {-3,-1,0,2};

        System.out.println(solution(a, b));

    }
}
