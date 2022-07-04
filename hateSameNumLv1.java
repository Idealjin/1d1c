package com.sj.study.programers.Random;

import java.util.*;

public class hateSameNumLv1 {

    // [1,3,0,1]


    public static int[] solution(int[] arr){

        List<Integer> list = new LinkedList<>();

        int first = arr[0];
        list.add(first);
        for (int a : arr){
            if (first != a){
            list.add(a);
            first = a;
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        int[] arr1 = {4,4,4,3,3};

        System.out.println(Arrays.toString(solution(arr1)));


    }

}
