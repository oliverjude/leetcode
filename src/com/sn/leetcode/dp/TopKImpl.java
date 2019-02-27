package com.sn.leetcode.dp;

import com.sn.leetcode.dp.intf.TopK;

/**
 * @author 18073758
 * Created by zhuzhengjun on 2019/1/16.
 */
public class TopKImpl implements TopK {
    @Override
    public int findKthLargest(int[] nums, int k) {
        if(k>nums.length){
            return -1;
        }
        int result = 0;
        while (k > 0) {
            int t = nums[0];
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] >= t) {
                    t = nums[i];
                }
            }
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == t) {
                    nums[i] = 0;
                    break;
                }
            }
            result = t;
            k--;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = new int[]{3, 2, 1, 5, 6, 4};
//        int[] a = new int[]{2, 1};
        TopKImpl topK = new TopKImpl();
        System.out.println(topK.findKthLargest(a, 2));
    }
}
