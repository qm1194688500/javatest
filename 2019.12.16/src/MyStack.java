/**
 * 实现栈
 * */
public class MyStack<T> {
    public T[] elem;
    public int top;
    public MyStack(){
        this.elem = (T[]) new Object[10];
        this.top = 0;
    }
    //判断是否满栈
    private boolean isFull() {
        return this.top==this.elem.length;
    }
    //添加元素
    public void push(T val) {
        if (isFull()){
            return;
        }
        this.elem[this.top] = val;
        this.top++;
    }
    //判断是否为空
    private boolean isEmpty() {
        return this.top==0;
    }
    //出栈
    public T pop(){
        if (isEmpty()){
            return null;
        }
        T tmp = elem[top-1];
        top--;
        return tmp;
    }
    //获取栈顶元素
    public T peak(){
        if (isEmpty()){
            return null;
        }
        return this.elem[this.top-1];
    }
}
