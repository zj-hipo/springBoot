package com.zj.springboot.basic;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 *你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 *你可以按任意顺序返回答案。
 * 输入：nums = [2,7,11,15], target = 9
 *输出：[0,1]
 *解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 * Hashb表的查询复杂度为O(1)
 */

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[]nums = new int[]{2,7,11,15};
        int target = 9;
        TwoSum tr=new TwoSum();
        int[] dalayResult=tr.twoSum(nums,target);
        System.out.println("求和："+Arrays.toString(dalayResult));
    }
}
