import java.util.Stack;

/**
 *实现最小栈
 * */
class MinStack {
    Stack<Integer> data;
    Stack<Integer> help;

    /** initialize your data structure here. */
    public MinStack() {
        this.data = new Stack<>();
        this.help = new Stack<>();
    }
    public void push(int x) {
        data.push(x);
        if (help.empty()||help.peek()>=x){
            help.push(x);
        }else{
            help.push(help.peek());
        }
    }
    public void pop() {
        if (this.data.empty()||this.help.empty()){
            return;
        }
        this.data.pop();
        this.help.pop();
    }
    public int top() {
        if (this.data.empty()){
            return -1;
        }
        return this.data.peek();
    }

    public int getMin() {
        return this.help.peek();
    }
}