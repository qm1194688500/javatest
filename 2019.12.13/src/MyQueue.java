class Node {
    int val;
    Node next;
    Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
    Node(int val) {
        this(val, null);
    }
}
public class MyQueue {
    private Node head = null;
    private Node tail = null;
    private int size = 0;
    public void offer(int v) {
        Node node = new Node(v);
        if (tail == null) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
        size++;
    }
    public int poll() {
        if (size == 0) {
            throw new RuntimeException("队列为空");
        }
        Node oldHead = head;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return oldHead.val;
    }
    public int peek() {
        if (size == 0) {
            throw new RuntimeException("队列为空");
        }
        return head.val;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public int size() {
        return size;
    }
}
