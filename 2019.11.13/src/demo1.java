public class demo1 {
    public static void main(String[] args) {
        SingleLinkList list = new SingleLinkList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.display();
        list.addIndex(0,0);
        list.display();
        list.addIndex(7,0);
        list.display();
        list.searchKey(0);
        list.deleteKey(0);
        list.display();
        list.deleteAllkey(3);
        list.display();
        list.clear();
        list.display();
    }
}
