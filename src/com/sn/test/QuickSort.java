package com.sn.test;

import javafx.util.Pair;

import java.util.LinkedList;

/**
 * @author 18073758
 * Created by zhuzhengjun on 2019/1/8.
 * copy from https://blog.csdn.net/qq_18952073/article/details/78807233
 */
public class QuickSort {

    public static int[] a = new int[]{
            0, 2, 10, 2, 1
    };

    static void quickSort(int low, int high) {
        while (low >= high - 1) {
            return;
        }

        int privot = a[low];
        int i = low, j = high;

        while (i < j) {
            while (i < j && a[j] >= privot) {
                j--;
            }

            if (i < j) {
                a[i++] = a[j];
            }

            while (i < j && a[i] <= privot) {
                i++;
            }
            a[j--] = a[i];

        }
        a[i] = privot;
        quickSort(low, i);
        quickSort(i + 1, high);


    }

    public static void quickSortByStack(int low, int high) {

        LinkedList<Pair> stack = new LinkedList<>();
        stack.push(new Pair(low, high));
        while (!stack.isEmpty()) {
            Pair pair = stack.pop();
            low = (int) pair.getKey();
            high = (int) pair.getValue();
            if (low >= high - 1) {
                continue;
            }
            int temp = a[low];
            int i = low, j = high - 1;

            while (i <= j) {
                while (i < j && a[j] >= temp) {
                    j--;
                }
                if (i < j) {
                    a[i++] = a[j];
                }
                while (i < j && a[i] <= temp) {
                    i++;
                }
                a[j--] = a[i];

            }
            a[i] = temp;
            if (i < high - 1) {
                stack.push(new Pair(i + 1, high));
            }
            if (low < i - 1) {
                stack.push(new Pair(low, i));

            }

        }


    }


    public static void main(String[] args) {

//        quickSort(0, 4);
//        for (int s : a) {
//            System.out.println(s);
//        }
        quickSortByStack(0, 5);
        for (int s : a) {
            System.out.println(s);
        }


    }


}
