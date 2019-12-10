public class MyListQueue {
    static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public Node front;
    public Node rear;
    public int usedSize=0;

    //入队
    public void offer(int data) {
        Node node = new Node(data);
        if (usedSize==0){
            this.front = node;
            this.rear = node;
            usedSize++;
        }else{
            this.rear.next = node;
            this.rear = node;
            usedSize++;
        }
        return;
    }
    //出队
    public int poll(){
        if (usedSize==0){
            throw new UnsupportedOperationException("队列为空");
        }
        int val = this.front.data;
        this.front = this.front.next;
        return val;
    }
}