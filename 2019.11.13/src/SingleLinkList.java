class ListNode{
    public int data;
    public ListNode next;
    public ListNode(int data){
        this.data=data;
        this.next=null;
    }
}
public class SingleLinkList {
    public ListNode head;
    public SingleLinkList(){
        this.head=null;
    }
    //头插法
    public void addFirst(int data){
        ListNode node = new ListNode(data);
        if (this.head==null){
            this.head=node;
        }else {
            node.next = this.head;
            this.head = node;
        }
    }
    //尾插法
    public void addLast(int data){
        ListNode node = new ListNode(data);
        ListNode cur = this.head;
        if (this.head==null){
            this.head=node;
        }else{
            while (cur.next!=null){
                cur=cur.next;
            }
            cur.next=node;
        }
    }
    //任意位置插入,第一个数据节点为0号下标
    private ListNode searchIndex(int index){
        //找到index-1位置
        ListNode pre = this.head;
        int count = 0;
        while (count<index-1){
            pre = pre.next;
            count++;
        }
        return pre;
    }
    public boolean addIndex(int index,int data){
        ListNode node = new ListNode(data);
        ListNode pre = searchIndex(index);
        if (index==0){
            node.next=this.head;
            this.head=node;
            return true;
        }
        if (index<0||index>getLength()){
            System.out.println("输入位置不合法");
            return false;
        }
        node.next=pre.next;
        pre.next=node;
        return false;
    }
    //获取链表长度
    public int getLength(){
        ListNode cur = this.head;
        int count = 0;
        while (cur!=null){
            cur=cur.next;
            count++;
        }
        return count;
    }
    //打印链表数据
    public void display(){
        ListNode cur = this.head;
        while (cur!=null){
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }
    //查找是否存在关键字key在链表中
    public boolean searchKey(int key){
        ListNode cur = this.head;
        while (cur!=null){
            if (cur.data==key){
                System.out.println("有关键字key");
                return true;
            }
            cur = cur.next;
            }
            return false;
        }
        //删除第一次出现关键字key的节点
    private  ListNode searchPrev(int key){
        ListNode cur = this.head;
        while (cur.next!=null){
            if (cur.next.data==key){
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }
    public void deleteKey(int key){
        if (this.head.data==key){
            this.head=this.head.next;
            return;
        }
        ListNode pre = searchPrev(key);
       if (pre==null){
           System.out.println("没有你要删除的结点");
       }
      ListNode del = pre.next;
       pre.next=del.next;

    }
    //删除所有出现关键字key的节点
    public void deleteAllkey(int key){
        
    }
    }




