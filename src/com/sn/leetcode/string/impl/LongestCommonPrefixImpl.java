package com.sn.leetcode.string.impl;

import com.sn.leetcode.string.inf.LongestCommonPrefix;

/**
 * @author 18073758
 * Created by zhuzhengjun on 2019/12/9.
 */
public class LongestCommonPrefixImpl implements LongestCommonPrefix {

    /**
     *执行结果：
     * 通过
     * 显示详情
     * 执行用时 :
     * 2 ms
     * , 在所有 java 提交中击败了
     * 47.82%
     * 的用户
     * 内存消耗 :
     * 37.9 MB
     * , 在所有 java 提交中击败了
     * 68.91%
     * 的用户
     */
    @Override
    public String longestCommonPrefix(String[] strs) {
        if (strs == null) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        if (strs.length == 0) {
            return "";
        }
        String tmp = strs[0];

        for (int i = 0; i < strs.length; i++) {
            if (tmp == null || "".equals(tmp)) {
                return "";
            }
            String str = strs[i];
            int len = str.length();
            int ts = 0;
            //标记  是否执行for循环
            int $ts = 0;
            for (int j = 0; j < len; j++) {
                if (j != tmp.length() && tmp.charAt(j) != str.charAt(j)) {
                    $ts++;
                    ts = j;
                    break;
                } else if (j == tmp.length()) {
                    $ts++;
                    ts = j;
                    break;

                }
            }
            if (ts == 0 && $ts != 0) {
                return "";
            }
            if (ts < len && ts != 0) {
                tmp = str.substring(0, ts);
            } else {
                tmp = str;
            }

        }
        return tmp;

    }

    public static void main(String[] args) {
        String[] s = new String[]{"aaa", "aa", "aaa"};
        LongestCommonPrefixImpl longestCommonPrefix = new LongestCommonPrefixImpl();
        System.out.println(longestCommonPrefix.longestCommonPrefix(s));

    }
}
