package com.sj.indivisual;

public class lotto45 {

    public int[] createLotto45(){
        int[] selNum = new int[6];
        for (int i = 0; i < selNum.length; i++) {
            selNum[i] = (int) (Math.random() * 45 ) + 1;
        }
        return  selNum;
    }

}
