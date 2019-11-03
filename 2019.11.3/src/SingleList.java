class ListNode{
    public int data;
    public ListNode next;
    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}
class SingleList {
    public ListNode head;//标志头

    public SingleList() {
        this.head = null;
    }

    //头插法
    public void addFirst(int data){
        ListNode node = new ListNode(data);
        if (head == null){
            this.head = node;
        }else {
            node.next = this.head;
            this.head = node;
        }
    }
    //尾插法
    public void addLast(int data){
        ListNode node = new ListNode(data);
        ListNode cur =  this.head;
        if (this.head == null){
            this.head = node;
        }else{
            while (cur.next != null){
                cur = cur.next;
            }
        }
    }
    //插入到index位置
    private ListNode searchIndex(int index) {
        ListNode tmp = this.head;
        for (int i = 0; i <index - 1 ; i++) {
            tmp = tmp.next;
        }
        return  tmp;
    }

    //插入到index位置
    //任意位置插入,第一个数据节点为0号下标
    public boolean addIndex(int index,int data){
        if(index == 0) {
            addFirst(data);
            return true;
        }
        ListNode prev = searchIndex(index);
        ListNode node = new ListNode(data);
        node.next = prev.next;
        prev.next = node;
        return false;
    }
    private ListNode searchPrev(int key) {
        ListNode tmp = this.head;
        for (int i = 0; i <key-1 ; i++) {
            tmp = tmp.next;
        }
        if (tmp!=null){
            return tmp;
        }else {
            return null;
        }
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){
        if (this.head.data==key){
            this.head=head.next;
        }else{
            ListNode pre = searchPrev(key);
            ListNode del = pre.next;
            pre.next = del.next;
        }


        //1、删除的节点如果是头结点

        //2、找到删除的节点的前驱  如果找不到  返回null

        //3、进行删除
    }
    public void removeAllkey(int key){//删除所有出现key关键字的数
        ListNode prev = this.head;
        ListNode cur = prev.next;

        while (cur != null) {
            if (prev.next.data == key) {
                prev.next = cur.next;
                cur = cur.next;
            } else {
                prev = cur;
                cur = cur.next;
            }
        }
        if(key == this.head.data){
                this.head = this.head.next;
            }

    }
    public void display(){
        if (this.head==null){
            return;
        }

    }
}
