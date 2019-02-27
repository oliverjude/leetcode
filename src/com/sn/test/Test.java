package com.sn.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

/**
 * 测试
 *
 * @author ljs.song
 * @date 2017-09-21 22:21
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(matchStr("北京 杭州 杭州 北京","abba" ));
    }

    /**
     * 思路：
     * 1. 首先找出匹配字串a的排重后的字符列表 s0
     * 2. 再找出被匹配字串b的排重后的字符列表 s1
     * 3. 比较两个字符列表size是否相同
     * 3.1 不同，直接false
     * 3.2 相同，则将s1中元素与s0中元素一一对应后，将被匹配字符串b的相应字符替换得到s2
     * 3.2.1 替换后，最终比较 s2的去除空格后的字符串是否与a相等
     * 3.2.2 不同，false,反之，true
     *
     * @param data  被匹配
     * @param partt 匹配
     * @return
     */
    public static boolean matchStr(String data, String partt) {
        String[] vals = data.split(" ");

        List<String> dataDist = Arrays.stream(vals).distinct().collect(Collectors.toList());
        char[] parrttSplit = partt.toCharArray();
        String[] parrtStr = new String[parrttSplit.length];
        for (int i = 0; i < parrttSplit.length; i++) {
            parrtStr[i] = String.valueOf(parrttSplit[i]);
        }

        List<String> parrtDist = Arrays.stream(parrtStr).distinct().collect(Collectors.toList());
        if (parrtDist.size() != dataDist.size()) {
            return false;
        }
        for (int i = 0; i < parrtDist.size(); i++) {
            data = data.replace(dataDist.get(i), parrtDist.get(i));
        }
        if (!partt.equals(data.replace(" ", ""))) {
            return false;
        }
        return true;
    }
}