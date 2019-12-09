package com.sn.test.sort;

/**
 * @author 18073758
 * Created by zhuzhengjun on 2019/9/27.
 */
public class Insert {
    private void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                for (int j = 0; j < i; j++) {
                    if (arr[i] <= arr[j] && arr[i] >= arr[j - 1]) {
                        int tmp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmp;
                    }
                }
            }

        }
        for (int t : arr) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        Insert insert = new Insert();
        int[] ints = new int[]{1, 2, 3, 5, 4, 2, 111, 21, 32, 23, 23};
        insert.insertSort(ints);


    }
}
