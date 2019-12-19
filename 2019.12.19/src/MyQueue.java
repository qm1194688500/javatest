/**
 * 用栈实现队列
 * */
import java.util.Stack;

public class MyQueue {
    public Stack<Integer> a;
    public Stack<Integer> b;
    public int front;

    /** Initialize your data structure here. */
    public MyQueue() {
        a = new Stack<>();
        b = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        if (a.empty()){
            this.front = x;
        }
        while (!a.empty()){
            b.push(a.pop());
        }
        a.push(x);
        while (!b.empty()){
            a.push(b.pop());
        }
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        int pre = a.pop();
        if (!a.empty()){
            front = a.peek();
        }
        return pre;
    }

    /** Get the front element. */
    public int peek() {
        return front;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return a.empty();
    }
}
