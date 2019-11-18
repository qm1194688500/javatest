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
        if (this.head==null){
            return ;
        }
        ListNode prev = this.head;
        ListNode cur = this.head.next;
        while (cur!=null){
            if (cur.data==key){
                prev.next=cur.next;
                cur=cur.next;
            }else{
                prev= cur;
                cur=cur.next;
            }
        }
        if (this.head.data==key){
            this.head=this.head.next;
        }
    }
    //清空链表
    public void clear(){
        //      this.head=null;
        ListNode cur=this.head;
        while (cur!=null){
            this.head=cur;
            cur=cur.next;
        }
        this.head=null;
    }
    //反转一个单链表。
    public ListNode reverseList(ListNode head) {
        ListNode cur = this.head;
        ListNode pre = null;
        while (cur!=null){
            ListNode curNext = cur.next;
            cur.next=pre;
            pre=cur;
            cur=curNext;
        }
        return pre;
    }
    //给定一个带有头结点 head 的非空单链表，返回链表的中间结点。如果有两个中间结点，则返回第二个中间结点。
    public ListNode middleNode(ListNode head){
        ListNode fast = this.head;
        ListNode last = this.head;
        while (fast!=null&&fast.next!=null){
            last= last.next;
            fast = fast.next.next;
        }
        return last;
    }
    //输入一个链表，输出该链表中倒数第k个结点。
    public ListNode FindKthToTail(ListNode head,int k) {
        if (head==null||k<=0){
            return null;
        }
        ListNode last = head;
        ListNode fast = head;
        for (int i = 0; i <k-1 ; i++) {
            if (fast==null){
                return null;
            }
            fast=fast.next;
        }
        if (fast==null){
            return null;
        }
        while (fast.next!=null){
            last = last.next;
            fast= fast.next;
        }
        return last;
    }
    //合并两个链表
    public ListNode mergeTwoLists2(ListNode l1, ListNode l2){
        if (l1==null){
            return l2;
        }
        if (l2==null){
            return l1;
        }
        ListNode newHead = new ListNode(-1);
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        ListNode temp = newHead;
        while(cur1!=null&&cur2!=null){
            if (cur1.data<cur2.data){
                temp.next = cur1;
                cur1 = cur1.next;
            }else{
                temp.next = cur2;
               cur2 = cur2.next;
            }
            temp = temp.next;
        }
        return newHead.next;
    }
    //将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接两个链表给定的所有元素组成的。
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newHead = new ListNode(-1);
        ListNode temp = newHead;
        ListNode head1 = l1;
        ListNode head2 = l2;
        if (head1==null){
            return head2;
        }
        if (head2==null){
            return head1;
        }
        while (head1!=null&&head2!=null){
            if (head1.data<=head2.data){
                temp.next=head1;
                head1 = head1.next;
            }else{
                temp.next=head2;
                head2= head2.next;
            }
            temp= temp.next;
        }
        if(head1==null){
            temp.next=head2;
        }
        if(head2==null){
            temp.next=head1;
        }
        return newHead.next;
    }
    //编写代码，以给定值x为基准将链表分割成两部分，所有小于x的节点排在大于或等于x的节点之前。
    public ListNode partition1(ListNode pHead, int x) {
            if (pHead==null||pHead.next==null){
                return pHead;
            }
            ListNode smallFirst = null;
            ListNode smallEnd = null;
            ListNode bigFirst = null;
            ListNode bigEnd = null;
            ListNode cur = pHead;
            while (cur!= null){
                if (cur.data<x){
                    if (smallFirst==null){
                        smallFirst=cur;
                        smallEnd=cur;
                    }else{
                        smallEnd.next=cur;
                        smallEnd = smallEnd.next;
                    }
                }else{
                    if (bigFirst==null){
                        bigFirst=cur;
                        bigEnd=cur;
                    }else{
                        bigEnd.next = cur;
                        bigEnd = bigEnd.next;
                    }
                }
                cur = cur.next;
            }
            if (smallFirst==null){
                return bigFirst;
            }
            smallEnd.next=bigFirst;
            if(bigFirst!=null){
                bigEnd.next=null;
            }
            return smallFirst;
    }
    public ListNode partition2(ListNode pHead, int x) {
        if(pHead==null||pHead.next==null){
            return pHead;
        }
        ListNode small = new ListNode(-1);
        ListNode big = new ListNode(-1);
        ListNode cur1 = small;
        ListNode cur2 = big;
        ListNode cur = pHead;
        while (cur!=null){
            if (cur.data<x){
                cur1.next=cur;
                cur1=cur1.next;
            }else{
                cur2.next=cur;
                cur2=cur2.next;
            }
            cur = cur.next;
        }
        if(small==null){
            return big.next;
        }
        cur1.next=big.next;
        if(big!=null){
            cur2.next=null;
        }
        return small.next;
    }
    //在一个排序的链表中，存在重复的结点，请删除该链表中重复的节点，重复的节点不保存，返回链表头指针。
    public ListNode deleteDuplication(ListNode pHead){
        if (pHead==null||pHead.next==null){
            return pHead;
        }
        ListNode newHead = new ListNode(-1);
        ListNode temp = newHead;
        ListNode cur = pHead;
        while (cur!=null){
            if (cur.next!=null&&cur.data==cur.next.data){
                while (cur.next!=null&&cur.data==cur.next.data){
                    cur = cur.next;
                }
                cur  = cur.next;
            }else{
                temp.next=cur;
                temp = temp.next;
                cur = cur.next;
            }
        }
        temp.next=null;
        return newHead.next;
    }
    //输入两个链表，找出它们的第一个公共结点。
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA==null||headB==null){
            return null;
        }
        ListNode curA = headA;
        ListNode curB = headB;
        while (curA!=curB){
            curA = curA==null? headB:curA.next;
            curB = curB==null?headA:curB.next;
        }
        return curA;
    }
    //链表的回文结构.

    //给定一个链表，判断链表中是否有环。

    //给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null.

    }




