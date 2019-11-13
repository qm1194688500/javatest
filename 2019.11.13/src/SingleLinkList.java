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
    //插入到index位置

    //获取链表长度
    //打印链表数据
    //查找是否存在关键字key在链表中
    //删除第一次出现关键字key的节点
    //删除所有出现关键字key的节点
    // 在 pos 位置新增元素
    // 获取 pos 位置的元素
    // 给 pos 位置的元素设为 value

}
