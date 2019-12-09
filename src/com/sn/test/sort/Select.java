package com.sn.test.sort;

/**
 * @author 18073758
 * Created by zhuzhengjun on 2019/9/27.
 */
public class Select {

    private void select(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if (min != i) {
                int tmp = arr[min];
                arr[min] = arr[i];
                arr[i] = tmp;
            }
        }
        for (int t : arr) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        Select select = new Select();

        int arr[] = new int[]{121, 1, 2, 3, 4, 7, 65, 5, 6};
        select.select(arr);

    }
}
