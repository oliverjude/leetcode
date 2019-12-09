package com.sn.leetcode.dp.impl;

import com.sn.leetcode.dp.intf.GenerateParenthesis;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 18073758
 * Created by zhuzhengjun on 2019/1/11.
 */
public class GenerateParenthesisImpl implements GenerateParenthesis {

//    @Override
//    public List<String> generateParenthesis(int n) {
//        if (n == 0) {
//            return new ArrayList<>();
//        }
//        List<String> list = new ArrayList<>();
//        char l = '(';
//        char r = ')';
//        int t = n;
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < t; i++) {
//            sb.append(l);
//        }
//        for (int i = 0; i < t; i++) {
//            sb.append(r);
//        }
//        list.add(sb.toString());
//        char[] parent = sb.toString().toCharArray();
//        for (int i = 0; i < t; i++) {
//            for (int j = 0; j < t - i; j++) {
//
//
//            }
//        }
//        return list;
//    }
//
//    public List<String> redistribute(List<String> ans, ){
//
//    }

    @Override
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList();
        backtrack(ans, "", 0, 0, n);
        return ans;
    }

    public void backtrack(List<String> ans, String cur, int open, int close, int max) {
        if (cur.length() == max * 2) {
            ans.add(cur);
            return;
        }

        if (open < max) {
            backtrack(ans, cur + "(", open + 1, close, max);
        }
        if (close < open) {
            backtrack(ans, cur + ")", open, close + 1, max);

        }
    }

    public void test(int t) {

        if (t < 0) {
            return;
        }
        test(--t);
    }


    public static void main(String[] args) {
        GenerateParenthesisImpl generateParenthesis = new GenerateParenthesisImpl();
        List<String> list = generateParenthesis.generateParenthesis(3);

        for (String s : list) {
            System.out.println(s);
        }
        int t = 1;
        generateParenthesis.test(t);
        System.out.println(t);

    }
}
