package com.sj.study.programers.Random;

public class keypadLv1_kakao {

    static String solution(int[] arr, String hand){

        StringBuilder answer1 = new StringBuilder("");
        String mainHand = "";

        if(hand.equals("right")){
            mainHand = "R";
        } else {
            mainHand = "L";
        }
        // * = 10, 0 = 11, # = 12
        int left = 10;
        int right = 12;

        for (int a : arr) {
            if(a == 0) a=11;
            if (a == 1 || a == 4 || a == 7) {
                answer1.append("L");
                left = a;
            } else if (a == 3 || a == 6 || a == 9) {
                answer1.append("R");
                right = a;
            } else {
                int leftdist = Math.abs(a - left) / 3 + Math.abs(a - left) % 3;
                int rightdist = Math.abs(a - right) / 3 + Math.abs(a - right) % 3;

                if (leftdist < rightdist) {
                    answer1.append("L");
                    left = a;
                } else if (leftdist > rightdist) {
                    answer1.append("R");
                    right = a;
                } else {
                    if (hand.equals("right")) {
                        answer1.append("R");
                        right = a;
                    } else {
                        answer1.append("L");
                        left = a;
                    }
                }

            }
        }
        String answer = String.valueOf(answer1);
        return answer;
    }

    public static void main(String[] args) {
//        LRLLL RLLRR L
        int[] arr = {1,3,4,5,8,2,1,4,5,9,5};

        System.out.println("1,3,4,5,8,2,1,4,5,9,5");

        System.out.println(solution(arr, "right"));
    }

}
