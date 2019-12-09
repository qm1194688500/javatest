public class demo1 {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtHead(2);
        myLinkedList.addAtHead(3);
        myLinkedList.display();
        myLinkedList.addAtTail(1);
        myLinkedList.addAtTail(2);
        myLinkedList.addAtTail(3);
        myLinkedList.display();
        myLinkedList.addAtIndex(-1,0);
        myLinkedList.display();
        myLinkedList.deleteAtIndex(0);
        myLinkedList.display();
    }
}
