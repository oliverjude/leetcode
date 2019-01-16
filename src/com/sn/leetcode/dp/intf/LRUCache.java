package com.sn.leetcode.dp.intf;

/**
 * @author 18073758
 * Created by zhuzhengjun on 2019/1/16.
 */
public interface LRUCache {

    /**
     * cache.put(1,1);
     * cache.put(2,2);
     * cache.get(1);       // 返回  1
     * cache.put(3,3);    // 该操作会使得密钥 2 作废
     * cache.get(2);       // 返回 -1 (未找到)
     * cache.put(4,4);    // 该操作会使得密钥 1 作废
     * cache.get(1);       // 返回 -1 (未找到)
     * cache.get(3);       // 返回  3
     * cache.get(4);       // 返回  4
     *
     * @param key
     * @return
     */
    int get(int key);

    void put(int key, int value);

}
