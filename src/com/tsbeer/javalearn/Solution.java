package com.tsbeer.javalearn;

public class Solution {
	
	//给定 nums = [2, 7, 11, 15], target = 9
	//
	//因为 nums[0] + nums[1] = 2 + 7 = 9
	//所以返回 [0, 1]
	public int[] twoSum(int[] nums, int target) {
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] {nums[i], nums[j]};
				}
			}
		}
		return new int[0];
    }
}
