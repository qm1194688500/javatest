class ListNode{
    public int data;
    public ListNode next;
    public ListNode prev;
    public ListNode(int data) {
        this.data = data;
    }
}
public class DoubleList {
        public  ListNode head;
        public  ListNode last;//尾巴
    public void addFirst(int data){
        //第一次插入
        ListNode node = new ListNode(data);
        if (this.head==null){
            this.head=node;
            this.last=node;
        }else{
            node.next=this.head;
            this.head.prev = node;
            this.head=node;
        }
    }
    public void addLast(int data){
        ListNode node = new ListNode(data);
        if (this.head==null){
            this.head=node;
            this.last=node;
        }else{
            node.prev=this.last;
            last.next = node;
            this.last = node;
        }
    }
    public void display(){
        if (this.head==null){
            return;
        }
        ListNode cur = this.head;
        while (cur!=null){
            System.out.print(cur.data + " ");
        }
        System.out.println();
    }
    public boolean addIndex(int index,int data){
        ListNode node = new ListNode(data);
        if (index==0){
            node.next=this.head;
            this.head.prev = node;
            this.head=node;
            return true;
        }
        if (index == size()){
            node.prev=this.last;
            last.next = node;
            this.last = node;
            return true;
        }
        ListNode cur = this.head;
        int count = 0;
        while (count<index){
            cur = cur.next;
            count++;
        }
        node.prev = cur.prev;
        node.next = cur;
        cur.prev.next=node;
        cur.prev = node;
        return true;
    }
    public boolean contains(int key){
        ListNode cur = this.head;
        while (cur!=null){
            if (cur.data==key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    private int size(){
        ListNode cur = this.head;
        int count = 0;
        while (cur!=null){
            cur = cur.next;
            count++;
        }
        return count;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){
        ListNode cur = this.head;
        while (cur!=null){
            if (cur.data==key){
                if (cur == this.head){
                    this.head=this.head.next;
                    this.head.prev=null;
                }else{
                    cur.prev.next = cur.next;
                    if (cur.next!=null){
                        cur.next.prev = cur.prev;
                    }else{
                        this.last=cur.prev;
                    }
                }
                return;
            }
            cur  =cur.next;
        }
    }
    public void removeAllKey(int key){
        ListNode cur = this.head;
        while (cur!=null){
            if (cur.data==key){
                if (cur == this.head){
                    this.head=this.head.next;
                    this.head.prev=null;
                    return;
                }else {
                    cur.prev.next = cur.next;
                    if (cur.next != null) {
                        cur.next.prev = cur.prev;
                    } else {
                        this.last = cur.prev;
                    }
                }
            }
            cur  =cur.next;
        }
    }
    public void clear(){
        while (this.head!=null){
            ListNode cur = this.head.next;
            this.head.next = null;
            this.head.prev = null;
            this.head = cur;
        }
        this.last = null;
    }
}
