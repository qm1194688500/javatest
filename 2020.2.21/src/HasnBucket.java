public class HashBucket {

    static class Node {
        private int key;
        private int value;
        private Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private Node[] array = new Node[7];//存放单链表的头结点
    private int size;//当前数据的个数


    public int getValue(int key) {

        int index = key % array.length;
        //遍历array[index]下标的链表，找到值为key的数据，并且返回
        Node cur = array[index].next;
        while (cur!=null){
            if (cur.value==key){
                return cur.value;
            }
            cur = cur.next;
        }
        return 0;
    }
}
