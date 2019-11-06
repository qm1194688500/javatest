public class demo1 {
    public static void main(String[] args) {
        SingleLinkList mySingleList = new SingleLinkList();
        mySingleList.addindex(0, 199);
        mySingleList.addlast(2);
        mySingleList.addlast(2);
        mySingleList.addlast(3);
        mySingleList.addlast(2);
        mySingleList.addlast(5);
        mySingleList.display();
        mySingleList.addindex(0, 2);
        mySingleList.display();
        Node n = mySingleList.middleNode();
        System.out.println(n.data);
        Node m = mySingleList.findKthToTail();
        System.out.println(m.data);

    }
}