package com.sn.leetcode.dp.impl;

import com.sn.leetcode.dp.intf.IsValidSudoku;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author 18073758
 * Created by zhuzhengjun on 2019/1/11.
 */
public class IsValidSudokuImpl implements IsValidSudoku {

    /**
     * 对于二维数组初始化
     *
     * @param board
     * @return
     */
    @Override
    public boolean isValidSudoku(char[][] board) {
        if (board.length != 9) {
            return false;
        }
        for (int i = 0; i < 9; i++) {
            List<Character> list = new ArrayList<>();
            for (char s : board[i]) {
                if (s != '.') {
                    list.add(s);
                }
            }
            return !judge(list);
        }


        return true;
    }

    public boolean judge(List<Character> a) {

        Set set = new HashSet<>();
        for (int t : a) {
            set.add(t);
        }
        return set.size() == a.size();

    }


    public static void main(String[] args) {
        IsValidSudokuImpl isValidSudoku = new IsValidSudokuImpl();
        isValidSudoku.isValidSudoku(new char[][]{});
    }
}
