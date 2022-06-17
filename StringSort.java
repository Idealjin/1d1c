package com.sj.study.backjoon;

import javax.lang.model.type.ArrayType;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        String 한글 = "다,나,가";
        List<String> sortedList = new LinkedList<>();
        sortedList.add(한글);
        Collections.sort(sortedList);
        System.out.println(sortedList + "정렬된 리스트");
        System.out.println("");
        char[] StringToChar = 한글.toCharArray();
        Arrays.sort(StringToChar);
        String 정렬된한글 = new String(StringToChar);
        System.out.println(정렬된한글);
        System.out.println("");System.out.println("");


        System.out.println(정렬된한글.replaceAll(",",""));

//        String restr =answer.replaceAll("\\b(?!\\b,\\b)\\w+\\b","");
//        restr = restr.replaceAll("[가-힣]","");
//        restr = restr.replaceAll(" ","");
//        if(!restr.contains(",") && restr.length() != 0){
//            restr = "";
//        }
//        System.out.println(restr + ",빼고 제거한 결과");
//        System.out.println(restr.length()+1);


    }
}
