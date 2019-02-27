package com.sn.test;

/**
 * @author 18073758
 * Created by zhuzhengjun on 2019/1/17.
 */
public class MaxHeapSort {


    public static void HeapSort(int[] arr) {
        int n = arr.length - 1;
        for (int i = (n - 1) / 2; i >= 0; i--) {
            //构造大顶堆，从下往上构造
            //i作为最后一个根节点，n为数组最后一个元素的下标
            HeapAdjust(arr, i, n);
        }
        for (int i = n; i > 0; i--) {
            //把最大的数，也就是顶放到最后
            //i每次减一，因为每次要放的位置每次都不是固定的
            swap(arr, i);
            //再构造大顶堆
            HeapAdjust(arr, 0, i - 1);
        }
    }

    public static void HeapAdjust(int[] arr, int parent, int length) {
        int tmp = arr[parent];
        for (int i = parent * 2 + 1; i <= length; i = i * 2 + 1) {
            //如果左孩子大于右孩子，就让i指向右孩子
            if (i < length && arr[i] < arr[i + 1]) {
                i++;
            }
            //如果父节点大于或者等于较大的孩子，那就退出循环
            if (tmp >= arr[i]) {
                break;
            }
            //如果父节点小于孩子节点，那就把孩子节点放到父节点上
            arr[parent] = arr[i];
            //把孩子节点的下标赋值给parent
            //让其继续循环以保证大根堆构造正确
            parent = i;
        }
        //将刚刚的父节点中的数据赋值给新位置
        arr[parent] = tmp;

    }

    //定义swap函数
    //功能：将跟元素与最后位置的元素交换
    //注意这里的最后是相对最后，是在变化的
    public static void swap(int[] arr, int i) {
        int temp = arr[0];
        arr[0] = arr[i];
        arr[i] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 8, 7, 2, 3, 4, 9};
        HeapSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
