public class demo1{
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.push(1);
        queue.push(2);
        queue.peek();  // 返回 1
        queue.pop();   // 返回 1
        queue.empty(); // 返回 false

    }
}