package com.sn.leetcode.dp.intf;

import java.util.List;

/**
 * @author 18073758
 * Created by zhuzhengjun on 2019/1/11.
 */
public interface GenerateParenthesis {


    /**
     * 给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
     *
     * 例如，给出 n = 3，生成结果为：
     *
     * [
     *   "((()))",
     *   "(()())",
     *   "(())()",
     *   "()(())",
     *   "()()()"
     * ]
     * @param n n
     * @return return
     */
     List<String> generateParenthesis(int n);
}
