class Node{//结点类
    public int data;
    public Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
class SingleLinkList{
    public Node head;//标志头
    public  SingleLinkList(){
        this.head = null;
    }
    //头插法
    public void addFirst(int data){
        Node node = new Node(data);
        if(head == null){
            this.head = node;
        }else{
            node.next=this.head;
            this.head = node;
        }
    }
    //尾插法
    public void addlast(int data){
        Node node = new Node(data);
        Node cur = head;
        if (cur == null){//判断是否第一次插入
            this.head = node;
        }else{
            while(cur.next != null){//找尾巴
                cur = cur.next;
            }
            cur.next=node;//进行插入
        }
    }
    public  int getLength(){//获取链表长度
        Node cur = this.head;
        int count = 0;
        while(cur!= null){
            cur = cur.next;
            count++;
        }
        return count;
    }
    //寻找index前一项
    private Node searchIndex(int index){
        Node cur = this.head;
        int count = 0;
        while (count<index - 1){
            cur = cur.next;
            count++;
        }
        return  cur;
    }
    //在index位置插入
    public boolean addindex(int index , int data){
        if (index<0 || index> getLength()){
            return false;
        }
        if (index==0){
            addFirst(data);
            return true;
        }
        Node pre =searchIndex(index);
        Node node = new Node(data);
        node.next = pre.next;
        pre.next= node;
        return true;
    }
    //查找是否包含关键字key在链表中
    public boolean contains(int key){
        Node cur = this.head;
        while (cur!= null){
            if (cur.data==key){
                System.out.println("有" +cur.data);
                return true;
            }
            cur = cur.next;
        }
        System.out.println("没有你要找的关键字");
        return false;
    }
    //返回该结点位置
    public Node contains2(int key){
        Node cur = this.head;
        while (cur!=null){
            if (cur.data==key){
                System.out.println(cur);
                return cur;
            }
            cur=cur.next;
        }
        System.out.println("null");
        return null;
    }
    //删除出现关键字key的结点
    private Node searchPre(int key){
        Node cur = this.head;
        while (cur!=null){
            if (cur.next.data==key){
                return cur;
            }
            cur=cur.next;
        }
        return null;
    }
    public void delete(int key){
        //删除的节点如果是头结点
        if(this.head.data==key){
            this.head= head.next;
        }
        //找到删除的节点的前驱，如果找不到。返回null
        Node pre = searchPre(key);
        if (pre==null){
            System.out.println("没有你要删除的结点");
            return;
        }
        //进行删除
        Node del = pre.next;
        pre.next=del.next;
    }
    //删除所有值为key的结点
    public void deleteAllKey(int key){
        Node pre = this.head;
        Node cur = this.head.next;
        while (cur!=null){
            if (cur.data==key){
                pre.next = cur.next;
                cur=cur.next;
            }else{
                pre=cur;
                cur=cur.next;
            }
        }
        //处理头结点
        if (head.data== key){
            this.head=this.head.next;
        }
    }
    //反转链表
    public Node reverseList(){
        Node cur = this.head;
        Node newHead =null;
        Node pre = null;
        while (cur!=null){
            Node curNext = cur.next;
            if (curNext==null){
                newHead=cur;
            }
            cur.next=pre;
            pre=cur;
            cur=curNext;
        }
        return newHead;
    }
    //返回链表中间值
    public Node middleNode(){
       /* Node num = this.head;
        int count = 0;
        while(num!= null){
            num = num.next;
            count++;
        }
        Node cur = this.head;
        for (int i = 0; i <count/2 ; i++) {
            cur=cur.next;
        }
        return cur;*/
       Node fast = this.head;
       Node slow = this.head;
       while (fast!=null&&fast.next!=null){
           fast= fast.next.next;
           slow = slow.next;
       }
       return slow;
    }
    //输出倒数第k个节点
   /* public Node findKthToTail(int key){
        Node fast = this.head;
        Node slow = this.head;
       
        return slow;
    }*/
    //清除链表
    public void clear(){
        //this.head=null;
        while (head!=null){
            Node cur = this.head.next;
            this.head.next=cur.next;
        }
        this.head=null;
    }
    //打印链表
    public void display(){
        if (head == null){
            System.out.println("该链表没有元素");
            return ;
        }
        Node dis = head;
        while (dis !=null){
            System.out.print(dis.data +"  ");
            dis = dis.next;
        }
        System.out.println();
    }
}