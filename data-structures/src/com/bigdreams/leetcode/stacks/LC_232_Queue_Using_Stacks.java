package com.bigdreams.leetcode.stacks;

import java.util.Stack;

public class LC_232_Queue_Using_Stacks {

    private Stack<Integer> data = new Stack<Integer>();
    private Stack<Integer> data2 = new Stack<Integer>();;


    public LC_232_Queue_Using_Stacks() {

    }

    public void push(int x) {
        while (!data.isEmpty()){
            data2.push(data.pop());
        }
        data.push(x);
        while(!data2.isEmpty()){
            data.push(data2.pop());
        }
    }

    public int pop() {
        if(!data.isEmpty())
        {
            return data.pop();
        }
        return -1;
    }

    public int peek() {
        if(!data.isEmpty())
        {
            return data.peek();
        }
        return -1;
    }

    public boolean empty() {
        return data.isEmpty();
    }
}
