package com.gamedirty.java.sorts;

import java.util.Arrays;

public class InsertSort implements ISort {

    //假设前边i个数据是排好序的，第i+1个数据拿出来往前边插入，直到最后一个
    @Override
    public int[] sort(int[] src) {
        int len = src.length;
        for (int i = 1; i < len; i++) {
            int temp = src[i];
            boolean hasInsert = false;
            for (int j = 0; j <= i; j++) {//与之前的所有数据做对比
                int mj = src[j];
                if (hasInsert) {
                    src[j] = temp;//当前位置放入一个 遍历对象
                    temp = mj;
                } else if (temp < mj) {//如果小于mj，替换当前遍历的位置，并取出，之后的遍历都做这种操作。
                    src[j] = temp;//当前位置放入一个 遍历对象
                    temp = mj;
                    hasInsert = true;//标记已经插入
                }
            }
            System.out.println(Arrays.toString(src));
        }
        return src;
    }
}
