public class TestBinaryTree {

    static class Node {
        public int data;
        public Node left;
        public Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public Node root = null;

    public void insert(int key) {
        Node node = new Node(key);
        Node cur = root;
        Node pre = null;
        if (root==null){
            root=node;
            return;
        }
        while (cur!=null){
            if (key < cur.data) {
                pre = cur;
                cur = cur.left;
            }else if (key==cur.data){
                return;
            }
            else {
                pre=cur;
                cur = cur.right;
            }
        }
        if (key<pre.data){
            pre.left=node;
        }
        if (key>pre.data){
            pre.right=node;
        }
    }

    //查找   key
    public Node search(int key) {
        Node cur = root;
        while (cur!=null) {
            if (key < cur.data) {
                cur = cur.left;
            } else if (key == cur.data) {
                return cur;
            } else {
                cur = cur.right;
            }
        }
        return null;
    }
    //删除key
    public void remove(int key) {
        Node cur = root;
        Node parent = null;
        while (cur != null) {
            if(cur.data == key) {
                //找到了要删除的节点
                removeNode(parent,cur);
                return;
            }else if(cur.data < key) {
                parent = cur;
                cur = cur.right;
            }else {
                parent = cur;
                cur = cur.left;
            }
        }
    }
    public void removeNode(Node parent,Node cur){
        if(cur.left == null) {

            if(cur == root) {
                root = cur.right;
            }else if(cur == parent.left){
                parent.left = cur.right;
            }else {
                parent.right = cur.right;
            }

        }else if(cur.right == null) {
            if (cur==root){
                root = cur.left;
            }else if (cur==parent.left){
                parent.left = cur.left;
            }else{
                parent.right = cur.left;
            }
        }else {

        }
    }
}