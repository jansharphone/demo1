package com.example.test;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author jiangxiaofeng
 * @create 2018-07-30 15:31
 * @description
 **/

public class TestQueue {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("hello");
        queue.add("world");
        queue.add("你好");
        System.out.println(queue.size());
        String str;
        if ((str = queue.poll()) != null) {
            System.out.println(str);
        }
        System.out.println();
        System.out.println(queue.size());
        queue.add("小姐姐");
        for (String s : queue) {
            System.out.println(s);
        }
    }
}
