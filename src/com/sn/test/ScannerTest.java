package com.sn.test;

import java.util.*;

/**
 * @author 18073758
 * Created by zhuzhengjun on 2019/1/8.
 */
public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String p = sc.next();
        System.out.println(wordPattern(p, s));

    }

    public static boolean wordPattern(String pattern, String str) {


        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<String>();
        String[] pieces = str.split(" ");
        if (pieces.length != pattern.length()) {
            return false;

        }
        int i = 0;
        for (String s : pieces) {
            char p = pattern.charAt(i);
//            System.out.println(p);
            // 如果该字符产生过映射
            if (map.containsKey(p)) {
                // 且映射的字符串和当前字符串不一样
                if (!s.equals(map.get(p))) {
                    return false;

                }
            } else {
                // 如果该字符没有产生过映射
                // 如果当前字符串已经被映射过了
                if (set.contains(s)) {
                    return false;
                }
                // 否则新加一组映射
                map.put(p, s);
                set.add(s);
            }
            i++;
        }
        return true;
    }
}
