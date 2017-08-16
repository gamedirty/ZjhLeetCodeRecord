package com.gamedirty.java.solutions;

/**
 * Created by zhjh on 2017/8/8.
 *
 *  question:
 *  https://leetcode.com/problems/two-sum/description/
 *  Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *  You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */


import java.util.HashMap;
import java.util.Map;

public class TwoSumSolution {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int ex = target - nums[i];
            if (map.containsKey(ex)) {
                return new int[]{map.get(ex), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        return new int[]{};
    }

    /**
     * 思路：的
     */

    public static int[] twoSum3(int[] nums, int target) {
        int buffLenth = 0;
        final int targetLenth = String.valueOf(target).length();
        int m = 0, n = 0;
        int[] buf = new int[nums.length];
        outer:
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < target) {
                inner:
                for (int j = 0; j < buffLenth; j++) {
                    int sum = nums[i] + (int) (buf[j] / Math.pow(10, targetLenth));
                    if (sum == target) {
                        int l = buf[j] % ((int) Math.pow(10, targetLenth));
                        m = Math.min(i, l);
                        n = Math.max(i, l);
                        break outer;
                    } else if (sum > target) {
                        break inner;
                    }
                }
                if (buffLenth == 0) {
                    buf[0] = nums[i] * ((int) Math.pow(10, targetLenth)) + i;
                } else {
                    boolean isInsert = false;
                    int h = nums.length;
                    int[] re = new int[nums.length];
                    for (int j = 0; j < buffLenth; j++) {
                        int a = (int) (buf[j] / Math.pow(10, targetLenth));
                        if (nums[i] < a) {
                            re[j + 1] = buf[j];
                            h = Math.min(h, j);
                            isInsert = true;
                        } else {
                            re[j] = buf[j];
                        }
                    }

                    if (h != nums.length)
                        re[h] = nums[i] * ((int) Math.pow(10, targetLenth)) + i;
                    if (h == nums.length && !isInsert) {
                        re[buffLenth] = nums[i] * ((int) Math.pow(10, targetLenth)) + i;
                    }
                    buf = re;
                }
                buffLenth++;
            }
        }
        return new int[]{m, n};
    }
}
