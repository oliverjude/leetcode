package com.sn.test;

/**
 * @author 18073758
 * Created by zhuzhengjun on 2019/1/17.
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 6, 5, 4, 3, 9, 8, 0};
        sort(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }


    public static int[] sort(int[] a, int low, int high) {
        int mid = (low + high) / 2;
        if (low < high) {
            sort(a, low, mid);
            sort(a, mid + 1, high);
            merge(a, low, mid, high);
        }
        return a;

    }


    public static void merge(int[] a, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= high) {
            if (a[i] < a[j]) {
                temp[k++] = a[j++];
            } else {
                temp[k++] = a[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = a[i++];
        }

        while (j <= high) {
            temp[k++] = a[j++];
        }
        for (int x = 0; x < temp.length; x++) {
            a[x + low] = temp[x];
        }


    }


}
