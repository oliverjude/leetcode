package com.sn.test.sort;

/**
 * @author 18073758
 * Created by zhuzhengjun on 2019/9/10.
 */
public class Bubble {

    public void maopao(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < i; j++) {
                if (ints[i] < ints[j]) {
                    int p = ints[i];
                    ints[i] = ints[j];
                    ints[j] = p;
                }
            }
        }

        for (int w = 0; w < ints.length; w++) {
            System.out.println(ints[w]);
        }
    }


    public static void main(String[] args) {
        int[] a = new int[]{0,4,3,2,1};
        Bubble maoPao = new Bubble();
        maoPao.maopao(a);

    }
}
