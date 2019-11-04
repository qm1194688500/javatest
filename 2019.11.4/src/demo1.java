public class demo1 {
    public static void main(String[] args) {
        SingleLinkList list = new SingleLinkList();
        list.addFirst(11);
        list.addFirst(12);
        list.addFirst(12);
        list.addFirst(13);
        list.display();
        list.addlast(5);
        list.addlast(6);
        list.addFirst(12);
        list.addlast(7);
        list.display();
        list.addindex(4,8);
        list.display();
       /* list.contains(11);//有11
        list.contains(100);//没有你要找的关键字
        list.contains2(100);//null
        list.contains2(11);//Node@1540e19d
        list.delete(11);
        list.display();
        list.delete(12);
        list.display();*/
       list.deleteAllKey(12);
       list.display();
       list.clear();

    }
}
