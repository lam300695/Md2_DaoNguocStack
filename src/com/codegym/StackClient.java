package com.codegym;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class StackClient {
    public static void main(String[] args) throws Exception {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(i);
        }

        System.out.println("Pre sort : " + list);

        Stack<Integer> stack = new Stack<>();
        while (list.size() > 0) {
            stack.push(list.remove(0));
        }
        while (stack.size() > 0) {
            list.add(stack.pop());
        }
        System.out.println("After sort : " + list);
    }
}
