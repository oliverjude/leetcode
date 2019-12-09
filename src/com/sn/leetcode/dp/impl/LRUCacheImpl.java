package com.sn.leetcode.dp.impl;

import com.sn.leetcode.dp.intf.LRUCache;

import java.util.*;

/**
 * @author 18073758
 * Created by zhuzhengjun on 2019/1/16.
 */
public class LRUCacheImpl implements LRUCache {

    public final Map<Integer, Integer> map;
    public final int capacity;

    public LRUCacheImpl(int capacity) {
        this.capacity = capacity;
        map = new LinkedHashMap<>();

    }


    @Override
    public int get(int key) {
        if (!map.keySet().contains(key)) {
            return -1;
        }
        int result = map.get(key);
        map.remove(key);
        map.put(key, result);
        return result;

    }

    @Override
    public void put(int key, int value) {


//        if (map.size() <= capacity) {
//            map.remove(key);
//            map.put(key, value);
//        } else {
//            map.remove(map.keySet().iterator().next());
//            map.put(key, value);
//        }
        map.remove(key);
        map.put(key, value);
        if(map.size()>capacity){
            Integer t = map.keySet().iterator().next();
            map.remove(t);
        }


    }

    public static void main(String[] args) {
        LRUCacheImpl lruCache = new LRUCacheImpl(2);
        lruCache.get(2);
        lruCache.put(2, 6);
        lruCache.get(1);
        lruCache.put(1, 5);
        lruCache.put(1, 2);
        lruCache.get(1);
        int t = lruCache.get(2);
        System.out.println(t);


    }
}
