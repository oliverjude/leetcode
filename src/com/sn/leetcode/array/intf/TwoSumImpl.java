package com.sn.leetcode.array.intf;

/**
 * @author 18073758
 * Created by zhuzhengjun on 2019/1/18.
 */
public class TwoSumImpl implements TwoSum {

    /**
     * 83ms
     * @param nums 数组
     * @param target 目标和
     * @return
     */
    @Override
    public int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        int[] rs = new int[2];
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    rs[0] = i;
                    rs[1] = j;

                    break;
                }

            }

        }

        return rs;

    }

    /**
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSumI(int[] nums, int target) {
        return null;

    }





    public static void main(String[] args) {
        TwoSumImpl twoSum = new TwoSumImpl();
        int[] a = new int[]{3, 2, 1, 1, 3};
        int[] b = twoSum.twoSum(a, 3);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
