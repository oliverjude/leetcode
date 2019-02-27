package com.sn.test;

/**
 * @author 18073758
 * @description Created by zhuzhengjun on 2018/12/10.
 * <p>
 * 平衡二叉树代码实现
 */
public class AVL<E> {

    private static class Node<E> {
        int h;
        E element;
        Node<E> left;
        Node<E> right;
        Node<E> parent;

        public Node(E element, int h, Node<E> left, Node<E> right, Node<E> parent) {
            this.element = element;
            this.h = h;
            this.left = left;
            this.right = right;
            this.parent = parent;
        }
    }

    public AVL() {
        root = new Node<E>(null, -1, null, null, null);
    }

    private Node<E> root;
    private int size = 0;


}
