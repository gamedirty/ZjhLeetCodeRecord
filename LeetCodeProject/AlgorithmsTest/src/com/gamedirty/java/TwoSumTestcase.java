package com.gamedirty.java;


import com.gamedirty.java.solutions.TwoSumSolution;

/**
 * Created by zhjh on 2017/8/8.
 */

public class TwoSumTestcase {
    public static void main(String[] args) {
        int[] array1 = new int[]{0, 13, 3, 2, 5, 1, 19, 234, 324, 153, 125, 231, 99, 44, 23, 4, 21, 121, 122, 321};
        int target1 = 63;
        int[] array2 = new int[]{23, 4, 3, 6, 2, 1, 90};
        int target2 = 9;
        Util.cur();
        for (int i = 0; i < 200000; i++) {
            TwoSumSolution.twoSum(array1, target1);
        }
        Util.cur();
        for (int i = 0; i < 200000; i++) {
            TwoSumSolution.twoSum2(array1, target1);
        }
        Util.cur();
        for (int i = 0; i < 200000; i++) {
            TwoSumSolution.twoSum3(array1, target1);
        }
        Util.cur();
    }


    private static String toStr(int[] res) {
        String s = "";
        for (int i : res) {
            s += i + ",";
        }
        return s;
    }
}
