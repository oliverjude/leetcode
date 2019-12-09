package com.sn.leetcode.dp.impl;

import com.sn.leetcode.dp.intf.MaxProfit;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 18073758
 * Created by zhuzhengjun on 2019/4/28.
 */
public class MaxProfitImpl implements MaxProfit {


    /**
     *
     * @param prices
     * @return
     */
    @Override
    public int maxProfit(int[] prices) {

        int sum = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            int s=prices[i + 1] - prices[i];
            if (s > 0) {
                sum += s;
            }
        }
        return sum;
    }

}
