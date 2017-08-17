package com.gamedirty.java.solutions;

import com.gamedirty.java.datastructure.ClearHeaderLinkedList;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * 得出给定字符串的最长子串的长度：
 * 使用一个链表辅助计算，一个int用来储存结果
 * 遍历字符串的每个字符，判断当前子串是否和链表的第一个元素相同：
 * 1）相同的话：说明当前子串到头了，记录当前长度，也加入到list中，并当前记录长度只为一
 * 2）不同的话：把当前遍历元素条加入list里边，同时记录的int值加一
 * <p>
 * Created by zhaojunhui on 2017/8/16.
 */
public class LongestSubstringSolution {
    public static int lengthOfLongestSubstring(String s) {
        int result = 0;
        LinkedList<String> linkedList = new LinkedList<String>();
        for (int i = 0; i < s.length(); i++) {
            String sub = String.valueOf(s.charAt(i));
            if (linkedList.contains(sub)) {
                Iterator<String> iterator = linkedList.iterator();
                while (iterator.hasNext()){//遍历时候删除需要用迭代器
                    String next = iterator.next();
                    iterator.remove();
                    if (next.equals(sub)){
                        break;
                    }
                }
            }
            linkedList.addLast(sub);
            printLink(linkedList);
            result = Math.max(result, linkedList.size());
        }
        return result;
    }

    private static void printLink(LinkedList<String> linkedList) {
        String s = "";
        for (String sub:linkedList){
            s+=sub;
        }
        System.out.println("linkedlist："+s);
    }

    public static int lengthOfLongestSubstring2(String s) {
        int result = 0;
        ClearHeaderLinkedList<String> linkedList = new ClearHeaderLinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            String sub = String.valueOf(s.charAt(i));
            linkedList.addLastOne(sub);
            printLink(linkedList);
            result = Math.max(result, linkedList.size());
        }
        return result;
    }

}
