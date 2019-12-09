package com.sn.resource;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author 18073758
 * Created by zhuzhengjun on 2019/11/18.
 */
public class Test {


    public static void main(String[] args) {
        Map map = new HashMap<>();
        Map map1 = new ConcurrentHashMap();
        Map map2 = new Hashtable();
        Map map3 = new LinkedHashMap();
        Map map4 = new TreeMap();
        map.put(null, null);
        map1.put(null, null);
        int t = 1;
        System.out.println(512 ^ 16);

        System.out.println();
    }
}
