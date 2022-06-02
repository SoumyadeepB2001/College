/*Two Sum
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 10^4
-10^9 <= nums[i] <= 10^9
-10^9 <= target <= 10^9
Only one valid answer exists.

https://leetcode.com/problems/two-sum/
*/

import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> list = new HashMap<>();
        int ar[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int c = target - nums[i];
            if (list.containsKey(c)) {
                ar[0] = list.get(c);
                ar[1] = i;
                break;
            }
            list.put(nums[i], i);
        }
        return ar;
    }
}