package com.redpig.Test;

/**
 * Created by hetao on 2018/10/10.
 */
public class OverflowTest {
    public static void main(String[] args){
//        System.out.println(1 >> 1);
        int a = Integer.MAX_VALUE + 1;
        int b = Integer.MIN_VALUE;
//        System.out.println(Integer.MAX_VALUE);
        System.out.println(a == b);
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println((1 >> 1));
//        System.out.println(a > b);
//        System.out.println(a - b > 0);
    }

    private class Node<T> {
        private Node<T> prev;
        private Node<T> next;
        private T item;
    }
}
