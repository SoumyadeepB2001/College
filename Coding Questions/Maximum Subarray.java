/*
 * Maximum Subarray
 * 
 * Given an integer array nums, find the contiguous subarray (containing at
 * least one number) which has the largest sum and return its sum.
 * 
 * A subarray is a contiguous part of an array.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * Example 2:
 * 
 * Input: nums = [1]
 * Output: 1
 * Example 3:
 * 
 * Input: nums = [5,4,-1,7,8]
 * Output: 23
 * 
 * 
 * Constraints:
 * 
 * 1 <= nums.length <= 10^5
 * -10^4 <= nums[i] <= 10^4
 * 
 * https://leetcode.com/problems/maximum-subarray/
 */

class Solution {
    public int maxSubArray(int[] nums) {
       int max=Integer.MIN_VALUE;
       int curSum=0;
       int min=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            curSum=curSum+nums[i];
            if(nums[i]>min)
                min=nums[i];
            if(curSum>max)
                max=curSum;
            if(curSum<0)
                curSum=0;            
        }
        if(max>0)
            return max;
        else
            return min;
        
    }
}