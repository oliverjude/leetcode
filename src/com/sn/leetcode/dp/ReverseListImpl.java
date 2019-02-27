package com.sn.leetcode.dp;

import com.sn.leetcode.dp.common.ListNode;
import com.sn.leetcode.dp.intf.ReverseList;

import java.util.List;

/**
 * @author 18073758
 * Created by zhuzhengjun on 2019/1/16.
 */
public class ReverseListImpl implements ReverseList {


    @Override
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode pre = null;
        ListNode next = null;
        ListNode head_node = head;
        while(curr!=null){
            next = curr.next;
            if(next == null){
                head_node = curr;
            }
            curr.next = pre;
            pre = curr;
            curr = next;

        }
        return head_node;
    }

    public static void main(String[] args) {
        ReverseListImpl reverseList = new ReverseListImpl();
        ListNode head = new ListNode(2);
        for (int i = 0; i < 8; i++) {
            ListNode listNode = new ListNode(i);
            head.next = listNode;
            head = head.next;
        }
        ListNode listNode = reverseList.reverseList(head);
        System.out.println(listNode.next.next.val);

    }
}



