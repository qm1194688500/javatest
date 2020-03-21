public class Solution {
    public void Mirror(TreeNode root) {
        if (root==null){
            return;
        }
        if (root.left==null&&root.right==null){
            return;
        }
        TreeNode treeNode = root.left;
        root.left=root.right;
        root.right=treeNode;
        Mirror(root.left);
        Mirror(root.right);
    }
}