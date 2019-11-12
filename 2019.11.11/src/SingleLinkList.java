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
    //判断链表是否重合
    public Node getIntersectionNode
    (Node headA, Node headB) {
        if(headA == null || headB == null) {
            return null;
        }

        Node pL = headA;//永远指向长的单链表
        Node pS = headB;//永远指向短的单链表

        int lenA = 0;
        int lenB = 0;

        //求的lenA  lenB
        while (pL != null) {
            lenA++;
            pL = pL.next;
        }
        while (pS !=null){
            lenB++;
            pS = pS.next;
        }
        //差值-》最长的单链表先走len步
        int len = lenA-lenB;
        if(len < 0) {
            pL = headB;
            pS = headA;
            len = lenB-lenA;
        }

        //让pL先走len步
        for (int i = 0; i <len ; i++) {
            pL=pL.next;
        }
        //开始一起走  (pL  != pS ) {一人一步走}
        while (pL!=null&&pS!=null&&pL!=pS){
            pL=pL.next;
            pS=pS.next;
        }
        if(pL==null&&pS==null){
            return  null;
        }
        return pL;
    }

    //将两个有序链表合并为一个新的链表

    //反转单链表
    public Node reverseList(){
        Node cur = this.head;
        Node pre = null;
        Node newHead = null;
        while(cur!=null){
            Node curNext = cur.next;
            if (curNext==null){
                newHead=cur;
            }
            cur.next = pre;
            pre = cur;
            cur=curNext;
            newHead=pre;
        }
        return newHead;
    }

    //在排序链表中删除重复节点
    /*public Node deleteRepeat(){
        Node cur = this.head;
        Node pre = this.head;
        while (cur != null){

        }
    }*/
    // 以x为基准分割链表
    public Node partition(int x){
        Node bs = null;
        Node be = null;
        Node as = null;
        Node ae = null;
        Node cur = this.head;
        while (cur != null) {
            if(cur.data < x) {
                //是不是第一次插入
                if(bs == null) {
                    bs=cur;
                    be=cur;
                }else {
                    be.next=cur;
                    be = be.next;
                }
            }else {
                //是不是第一次插入
                if(as == null) {
                    as=cur;
                    ae=cur;
                }else {
                    ae.next = cur;
                    ae = ae.next;
                }
            }
            cur = cur.next;
            if (bs==null){
                return bs;
            }
        }
        be.next=as;
        return bs;
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