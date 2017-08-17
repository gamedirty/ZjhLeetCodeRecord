package com.gamedirty.java;

import com.gamedirty.java.solutions.LongestSubstringSolution;

/**
 * Created by zhaojunhui on 2017/8/16.
 */
public class LongestSubstringTestcase {
    public static void main(String[] args){
        String s = "bdbbbba";
        System.out.println("最长子串的长度是："+ LongestSubstringSolution.lengthOfLongestSubstring(s));
        System.out.println("最长子串的长度是："+ LongestSubstringSolution.lengthOfLongestSubstring2(s));

    }

}
