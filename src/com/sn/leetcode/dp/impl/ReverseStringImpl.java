package com.sn.leetcode.dp.impl;

import com.sn.leetcode.dp.intf.ReverseString;

/**
 * @author 18073758
 * Created by zhuzhengjun on 2019/1/16.
 */
public class ReverseStringImpl implements ReverseString {
    @Override
    public String reverseString(String s) {

        if (s == null || s.isEmpty()) {
            return s;
        }
        char[] c = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            swap(c,i,j);
            i++;
            j--;
        }
        return new String(c);
    }
    public void swap (char[] ch , int i ,int j){
        char tmp = ch[i];
        ch[i]=ch[j];
        ch[j]=tmp;

    }

    public static void main(String[] args) {
        ReverseStringImpl reverseString = new ReverseStringImpl();

        System.out.println(reverseString.reverseString("hello"));
    }
}
