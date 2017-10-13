package com.gamedirty.java.sorts;

/**
 * 冒泡排序
 *      一遍遍遍历，第一遍确定最大的一个
 */
public class BubbleSort implements ISort {
    @Override
    public int[] sort(int[] src) {
        int len = src.length;
        for (int i = len-2;i>=0;i--){
            for (int j = 0;j<=i;j++){
                if (src[j]>src[j+1]){
                    int temp = src[j];
                    src[j] = src[j+1];
                    src[j+1] = temp;
                }
            }
        }
        return src;
    }
}
