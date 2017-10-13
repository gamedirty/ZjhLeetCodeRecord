package com.gamedirty.java.sorts;

public class SimpleSort implements ISort {
    @Override
    public int[] sort(int[] src) {
        int len = src.length;

        for (int i = 0;i<len-1;i++){//遍历起始位置
            int target=-1;
            int min = Integer.MAX_VALUE;
            for (int j  = i;j<len;j++){//遍历当前子集中最小元素
                if (src[j]<min){
                    target = j;
                    min = src[j];
                }
            }
            if (i!=target){
                int temp = src[i];
                src[i] = src[target];
                src[target] = temp;
            }

        }
        return src;
    }
}
