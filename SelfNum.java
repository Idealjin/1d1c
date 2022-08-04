package com.sj.study.backjoon;

import java.util.*;

public class SelfNum {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i <= 10000; i++) {
            String Val = String.valueOf(i);
            int valLen = Val.length();
            int sum = 0;

            for (int j = 0; j < valLen; j++) {
                sum += Integer.parseInt(Val.substring(j, j+1));
            }
            arr.add(sum+i);
        }

        for (int i = 0; i <= 10000; i++) {
            if (arr.contains(i) == false) System.out.println(i);;
        }
    }
}
