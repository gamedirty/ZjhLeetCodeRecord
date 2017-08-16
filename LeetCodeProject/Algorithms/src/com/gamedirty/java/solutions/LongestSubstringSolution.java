package com.gamedirty.java.solutions;

import java.util.LinkedList;

/**
 *
 * 得出给定字符串的最长子串的长度：
 *          使用一个链表辅助计算，一个int用来储存结果
 *          遍历字符串的每个字符，判断当前子串是否和链表的第一个元素相同：
 *                                                              1）相同的话：说明当前子串到头了，记录当前长度，也加入到list中，并当前记录长度只为一
 *                                                              2）不同的话：把当前遍历元素条加入list里边，同时记录的int值加一
 *
 * Created by zhaojunhui on 2017/8/16.
 */
public class LongestSubstringSolution {
    public static int lengthOfLongestSubstring(String s) {
        int n = 0;
        int result = 0;
        int len  = s.length();
        LinkedList<String> list  = new LinkedList<>();
        for ( int i = 0;i<len;i++){
            String ss = String.valueOf(s.charAt(i));
            if (list.contains(ss)){

                list.removeFirst();
                list.addLast(ss);
            }else {
                list.addLast(ss);
                n++;
            }
            result = Math.max(result,n);

        }

        return result;
    }
}
