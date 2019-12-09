package com.sn.leetcode.string.impl;

import com.sn.leetcode.string.inf.IsValid;

import java.util.Stack;

/**
 * @author 18073758
 * Created by zhuzhengjun on 2019/12/9.
 */
public class IsValidImpl implements IsValid {
    /**
     *
     */
    @Override
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
                continue;
            }
            char c = getMatch(s.charAt(i));
            if (stack.empty()) {
                return false;
            }
            if (stack.peek() == c) {
                stack.pop();

            }
        }
        return stack.empty();

    }

    private char getMatch(char c) {
        if (c == ')') {
            return '(';
        }
        if (c == '}') {
            return '{';
        }
        if (c == ']') {
            return '[';
        }
        return '(';
    }

}
