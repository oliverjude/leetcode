package com.sn.leetcode.bitoperation.intf;

/**
 * @author 18073758
 * Created by zhuzhengjun on 2019/1/18.
 */
public class SingleNumberImpl implements SingleNumber {
    /**
     * 异或运算符作用：运算规则：0^0=0；  0^1=1；  1^0=1；   1^1=0；
     * 类似换苹果，两个人有苹果或者两个人都没有苹果，交换0次，只要一个人有，给另外一个人交换1次
     *
     * @param nums
     * @return
     */
    @Override
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = new int[]{0,1,0,1,0,1,99,99,99,2};
        SingleNumberImpl singleNumber = new SingleNumberImpl();
        System.out.println(singleNumber.singleNumber(a));
    }
}
