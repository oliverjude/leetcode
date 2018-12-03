package com.sn.leetcode.dp;

import com.sn.leetcode.dp.intf.RegularExpressionMatching;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * @author 18073758
 * @description Created by zhuzhengjun on 2018/12/3.
 */
public class RegularExpressionMatchingImpl implements RegularExpressionMatching {


    @Override
    public  boolean isMatch(String s, String p) {

        if (s == null && p == null) {
            return true;
        }
        if (s == null && p != null || p == null && s != null) {
            return false;
        }
        String pt = new String(".*");
        if (pt.equals(p)) {
            return true;
        }
        char[] pa = p.toCharArray();
        char[] sa = s.toCharArray();

        int m = 0, n = 0;
        for (int i = 0; i < pa.length; i++) {
            if (pa[i] == '.') {
                m++;
            } else if (pa[i] == '*') {
                n++;
            }
        }
        if (n == 0 && m == 0) {
            if (pa.length != sa.length) {
                return false;
            }
            if (s.equals(p)) {
                return true;
            }
        }
        int i = sa.length, j = pa.length;
        boolean[] ack = new boolean[sa.length];
        while (i != 0) {
         if(pa[j-1]=='*') {

         }
        }
        return false;

    }

}
