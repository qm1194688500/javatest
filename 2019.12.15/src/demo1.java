public class demo1 {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        TreeNode node = binaryTree.find(binaryTree.buildTree(),'e');
        System.out.println(node);
    }
}
