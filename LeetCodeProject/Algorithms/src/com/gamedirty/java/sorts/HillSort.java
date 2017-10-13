package com.gamedirty.java.sorts;

public class HillSort implements ISort {
    @Override
    public int[] sort(int[] src) {
        int len = src.length;
        int d = len-1;

        do {
            for (int i = 0;i<len;i++){
                if (i+d>len-1){//如果比较的最大下标出界，本轮循环结束
                    break;
                }
                if (src[i]>src[i+d]){
                    int temp = src[i+d];
                    src[i+d] = src[i];
                    src[i] = temp;
                }

            }
        }while (d-->0);
        return src;
    }
}
