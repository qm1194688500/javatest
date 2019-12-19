import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 用队列实现栈
 * push(x) -- 元素 x 入栈
 * pop() -- 移除栈顶元素
 * top() -- 获取栈顶元素
 * empty() -- 返回栈是否为空
 * */
class MyStack {
    public Queue<Integer> q1;
    public Queue<Integer> q2;
    public int top;

    /** Initialize your data structure here. */
    public MyStack() {
        q1 = new LinkedList();
        q2 = new LinkedList();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        q1.add(x);
        top = x;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        while (q1.size()>1){
           top = q1.remove();
           q2.add(top);
        }
        int x = q1.remove();
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return x;
    }

    /** Get the top element. */
    public int top() {
        return top;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.isEmpty();
    }
}