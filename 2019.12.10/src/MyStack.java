public class MyStack<T> {
    public  T[] elem;
    public int top;

    public MyStack() {
        this.elem = (T[]) new Object[10];
        this.top = 0;
    }
}
