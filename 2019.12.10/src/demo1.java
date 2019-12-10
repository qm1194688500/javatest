public class demo1 {
    public static void main(String[] args) {
        MyListQueue myListQueue = new MyListQueue();
        myListQueue.offer(1);
        myListQueue.offer(2);
        myListQueue.offer(3);
        System.out.println(myListQueue.poll());
        System.out.println(myListQueue.usedSize);
    }
}
