package com.sangjin.test;

public class Solution {

	public double soulution(int[] arr) {
		double answer = 0;
		
		int temp = 0;
		
		for(int i =0; i < arr.length; i++) {
			
			temp += arr[i];
		}
		System.out.println(arr.length);
		answer = ((double) temp / arr.length);
		
		return answer;
	}
	
}
