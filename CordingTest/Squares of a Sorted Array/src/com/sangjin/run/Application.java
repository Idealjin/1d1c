package com.sangjin.run;


import java.util.Arrays;
import java.util.HashMap;

import java.util.Map;



public class Application {

	/*
	 * Given an integer array nums sorted in 
	 * non-decreasing order, return an array of the 
	 * squares of each number sorted in non-decreasing order.
	 * 
	 * Example 1:

		Input: nums = [-4,-1,0,3,10]
		Output: [0,1,9,16,100]
		Explanation: After squaring, the array becomes [16,1,0,9,100].
		After sorting, it becomes [0,1,9,16,100].
	 * 
	 * Example 2:

		Input: nums = [-7,-3,2,3,11]
		Output: [4,9,9,49,121]
 

		Constraints:
	
		1 <= nums.length <= 104
		-104 <= nums[i] <= 104
		nums is sorted in non-decreasing order.

	 * 
	 * */
	
	static int[] inum = new int[10];
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		menu:
//		while(true) {
//		int j = 0;
//		
//		System.out.print("숫자를 입력하세요. : ");
//		inum[j] = sc.nextInt();
//		sc.nextLine();
//		System.out.print("계속 하시겠습니까?(Y/N) : ");
//		String con = sc.nextLine().toUpperCase();
//		if(con.equals("N")) {
//			break menu;
//		}
//		j++;
//		
//		
//		}
//		List<Integer> result = new ArrayList<>();
		int[] nums = {10,-6,3,1,5,4};
		int[] result = new int[nums.length];
//		Map<Integer, Integer> result2 = new HashMap<>();
		result = sortedSquares(nums);
//		System.out.println(result2);	
		for(int res : result) {
			System.out.print(res + " ");
		}
//		
	}

   public static int[] sortedSquares(int[] nums) {
        
    	int[] result = new int[nums.length];
    	
    	for(int i = 0; i < nums.length; i++) {
    		result[i] = nums[i] * nums[i];
    	}
    	Arrays.sort(result);
    	
//    	Map<Integer, Integer> result2 = new HashMap<>();
//    	for(int i =0; i < result.length; i++) {
//    		result2.put(result[i], result[i]);
//    	}
    	
    	
    	
    	
    	return result;
    }
}
