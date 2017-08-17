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
     * 问题描述：给定一个数组和一个数字，约定数组里必定有两个数字的和等于给定的数字，和等于给定数字的两个数组元素的下标。
     *          这个思路假定了都是正整数TODO:兼容负数
     * 思路： 准备一个与给定数组等长度的、有小到大排序的数组arr辅助计算，遍历给定数组得到元素m，与给定Target进行比较,如果比target大则pass。
     *         如果比target小，则按从小到大顺序拿到arr中的整数与m求和并与target比较大小：
     *                                                                                 1）相等，循环结束，返回结果
     *                                                                                 2）和小于target，go on
     *                                                                                 3）大于target，循环结束，无结果
     * 由于数组arr要同时记录遍历到的元素的值和下标，我这里记录的具体数字是由值和下标计算出来的一个结果,可以通过计算反推出值和下标
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
