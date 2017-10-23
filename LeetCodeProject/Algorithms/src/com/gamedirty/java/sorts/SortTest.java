package com.gamedirty.java.sorts;

import java.util.Arrays;

public class SortTest {
    private static final int[] NUMBERS =
            {49, 38, 65, 97, 76, 13, 27, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51};

    public static void main(String[] args) {
        ISort sort = new BubbleSort();
        sort.sort(NUMBERS);
        System.out.println(Arrays.toString(NUMBERS));
        System.out.println("找到51的位置是："+new BinarySearch().indexOf(NUMBERS,51));
    }


}
