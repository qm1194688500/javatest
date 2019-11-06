class Node{//结点类
    public int data;
    public Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
class SingleLinkList {
    public Node head;//标志头

    public SingleLinkList() {
        this.head = null;
    }

    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        if (head == null) {
            this.head = node;
        } else {
            node.next = this.head;
            this.head = node;
        }
    }

    //尾插法
    public void addlast(int data) {
        Node node = new Node(data);
        Node cur = head;
        if (cur == null) {//判断是否第一次插入
            this.head = node;
        } else {
            while (cur.next != null) {//找尾巴
                cur = cur.next;
            }
            cur.next = node;//进行插入
        }
    }

    public int getLength() {//获取链表长度
        Node cur = this.head;
        int count = 0;
        while (cur != null) {
            cur = cur.next;
            count++;
        }
        return count;
    }
}
