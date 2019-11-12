public class demo1 {
//合并两个有序链表
    public Node mergeTwoLists(Node headA, Node headB){
        Node newHead = new Node(-1);
        Node tmp = newHead;
        while (headA!=null&&headB!=null){
            if (headA.data<headB.data){
                tmp.next=headA;
                headA=headA.next;
            }else{
                tmp.next=headB;
                headB=headB.next;
            }
            tmp = tmp.next;
        }
        if (headA!=null){
            tmp.next=headA;
        }
        if (headB!=null){
            tmp.next=headB;
        }
        return newHead.next;
    }
}

