/*
TwoSum
Difficulty: Easy
Contributor: LeetCode
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.
*/

import java.lang.*;
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        
        int[] sol = new int[2];
        int find;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
            find = target - nums[i];
            if(map.containsKey(find) && map.get(find) != i) {
                sol[1] = i;
                sol[0] = map.get(find);
                return sol;
            }
        }
        
        return sol;
    }
}
