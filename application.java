package com.sj.toss;

import java.util.LinkedList;
import java.util.List;

public class application {

    public static void main(String[] args) {
        String s = "0";
        int answer = 0;
        List<Integer> aweNum = new LinkedList<>();

        int check = 0;
        char temp=s.charAt(0);
        for (int i = 1; i < s.length(); i++) {

            System.out.println(temp + "temp");
            if (temp == s.charAt(i)) {
                check++;
                System.out.println(check);
            }else{
                check=0;
            }
            temp = s.charAt(i);
            if (check == 2 && temp == s.charAt(i)){
                aweNum.add(Character.getNumericValue(s.charAt(i)));
                check =0;
            }
        }
        System.out.println(aweNum);
        int aweNumMax =0;
        if (aweNum.size() == 0){
            answer= 0;
        }
        if (aweNum.size() > 1) {
            for (int num : aweNum) {
                if (aweNumMax < num) {
                    aweNumMax = num;
                }
            }
        }else{
            if (aweNum.size() != 0) {
                aweNumMax = aweNum.get(0);
            }
        }

        String answerTemp = Integer.toString(aweNumMax)
                            +Integer.toString(aweNumMax)
                            +Integer.toString(aweNumMax);
        System.out.println(answerTemp);

        answer = Integer.parseInt(answerTemp);
        System.out.println("answer" + answer);



    }
}
