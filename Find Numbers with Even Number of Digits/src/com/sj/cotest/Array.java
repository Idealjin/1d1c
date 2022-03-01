package com.sj.cotest;

public class Array {
	public static void main(String[] args) {
		
		int[] nums = {11,224,34,5,3245};
		int result = 0;
		result = findNumbers(nums);
		System.out.println("result : " + result);
		
		
}

	private static int findNumbers(int[] nums) {
		int count = 0;
		for(int num : nums) {
			if(String.valueOf(num).length() % 2 == 0) {
				count++;
			}
	}
		
		return count;
}
}
	
	
	
	
	

