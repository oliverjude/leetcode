package com.sn.test;

/**
 * @author 18073758
 * @description Created by zhuzhengjun on 2018/12/4.
 * 论排序算法的最高境界，当属休眠排序莫属，前无古人，后无来者
 */
public class ArraySort implements Runnable {

    private int number;

    public ArraySort(int number) {

        this.number = number;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{64, 70, 122, 90, 57, 90, 90, 1000000000};
        for (Integer num : nums) {
            new Thread(new ArraySort(num)).start();
        }
    }

    @Override
    public void run() {
        try {
            Thread.sleep(this.number);
            System.out.println(this.number);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
