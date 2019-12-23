
import java.util.*;

class TreeNode{
    char val;
    TreeNode left;
    TreeNode right;
    public TreeNode(char val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
 public class BinaryTree {
    public BinaryTree() {
    }
    public TreeNode buildTree() {
    TreeNode root = new TreeNode('A');
    TreeNode B = new TreeNode('B');
    TreeNode C = new TreeNode('C');
    TreeNode D = new TreeNode('D');
    TreeNode E = new TreeNode('E');
    TreeNode F = new TreeNode('F');
    TreeNode G = new TreeNode('G');
    TreeNode H = new TreeNode('H');
    root.left = B;
    root.right = C;
    B.left = D;
    B.right = E;
    E.right = H;
    C.left = F;
    C.right = G;
    return root;
}
    // 前序遍历
    public void preOrderTraversal(TreeNode root){
        if(root == null) {
            return;
        }
        System.out.print(root.val+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    //前序遍历（非递归形式）
     List<Character> preOrderTraversalNor(TreeNode root){
        List<Character> list = new ArrayList<>();
         Stack<TreeNode> stack = new Stack<>();
         TreeNode cur = root;
         while (cur!=null||!stack.empty()){
             while (cur!=null){
                 stack.push(cur);
                 System.out.println(cur.val+"");
                 list.add(cur.val);
                 cur = cur.left;
             }
             cur = stack.pop();
             cur = cur.right;
         }
         return list;
     }
     //层序遍历
     public void levelOrderTraversal(TreeNode root){
         Queue<TreeNode> queue = new LinkedList<>();
         if (root==null){
             queue.offer(root);
         }
         while (!queue.isEmpty()){
             TreeNode cur = queue.poll();
             System.out.println(cur.val + "");
         if (cur.left!=null){
             queue.offer(cur.left);
         }
         if (cur.right!=null){
             queue.offer(cur.right);
         }
         }

     }
    public void inOrderTraver(TreeNode root){
        if (root == null){
            return;
        }
        inOrderTraver(root.left);
        System.out.println(root.val + "");
        inOrderTraver(root.right);
    }
    public void postOrderTraver(TreeNode root){
        if (root == null){
            return;
        }
        postOrderTraver(root.left);
        postOrderTraver(root.right);
        System.out.println(root.val + "");

    }
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> list = new ArrayList<>();
        if (root==null){
            return list;
        }
        List<Integer> list1 = inorderTraversal(root.left);
        list.addAll(list1);
        System.out.println(root.val);
        //list.add(root.val);
        List<Integer> list2 = inorderTraversal(root.right);
        list.addAll(list2);
        return list;
    }
    //求叶子结点个数
    public int getLeafSize2(TreeNode root){
        if (root==null){
            return 0;
        }else if (root.left==null&&root.right==null){
            return 1;
        }
        return getLeafSize2(root.left) + getLeafSize2(root.right);
    }
    //求第k层节点的个数
    public int getKLevelSize(TreeNode root, int k){
    if (root==null){
        return 0;
    }
    if (k==1){
        return 1;
    }
    return getKLevelSize(root.left,k-1) + getKLevelSize(root.right,k-1);
    }
    //前序遍历的形式查找
    public TreeNode find(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (root.val == val) {
            return root;
        }
        TreeNode ret = find(root.left,val);
        TreeNode ret1 = find(root.right,val);
        return ret!=null ? ret : ret1;
    }
    //判断是否是相同树
     public boolean isSameTree(TreeNode p,TreeNode q){
        if (p==null&&q!=null||p!=null&&q==null){
            return false;
        }
        if (p==null&&q==null){
            return true;
        }
        if (p.val!=q.val){
            return false;
        }
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
     }
    //判断一个树中是否包含另一个树
    public boolean isSubTree(TreeNode s, TreeNode t) {
        if (isSameTree(s,t)){
            return true;
        }
        if (isSubTree(s.left,t)){
            return true;
        }
        if (isSubTree(s.right,t)){
            return true;
        }
        return false;
    }
    //求二叉树的最大深度
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftHight = maxDepth(root.left);
        int rightHight = maxDepth(root.right);

        return leftHight > rightHight
                ? leftHight + 1 : rightHight + 1;

    }
    //判断是否是平衡二叉树
    public boolean isBalanced(TreeNode root) {
        if (root==null){
            return true;
        }
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        return Math.abs(leftHeight-rightHeight)<=1&&isBalanced(root.left)&&isBalanced(root.right);
    }
    //判断二叉树是否是对称二叉树
     public boolean isSymmetrcChild(TreeNode leftTree,TreeNode rightTree){
        if (leftTree==null&&rightTree==null){
            return true;
        }
        if (leftTree==null||rightTree==null){
            return false;
        }
        return leftTree.val==rightTree.val&&isSymmetrcChild(leftTree.right,rightTree.left)
                &&isSymmetrcChild(leftTree.left,rightTree.right);
     }

    public boolean isSymmetric(TreeNode root) {
        if (root==null){
            return false;
        }
        return isSymmetrcChild(root.left,root.right);
    }
    //

}
