package demo;

import test.TreeNode;

import java.util.ArrayList;
import java.util.Iterator;

class Main{
    //分别按照二叉树先序，中序和后序打印所有的节点。
    public static ArrayList<Integer> first = new ArrayList<>();
    public static ArrayList<Integer> mid = new ArrayList<>();
    public static ArrayList<Integer> end = new ArrayList<>();
    public static void main(String[] args) {

    }
    private static final int[] toIntArray(ArrayList<Integer> arrayList){
        int[] intArray = new int[arrayList.size()];
        Iterator<Integer> iterator = arrayList.iterator();
        int i = 0;
        while (iterator.hasNext()){
            intArray[i] = iterator.next();
            i++;
        }
        return intArray;
    }
    public int[][] threeOrders (TreeNode root) {
        int[][] ret = new int[3][];
        headOrder(root);
        midOrder(root);
        endOrder(root);
        ret[0] = toIntArray(first);
        ret[1] = toIntArray(mid);
        ret[2] = toIntArray(end);
        return ret;
    }
    public static void headOrder(TreeNode root){
        if (root!=null){
            first.add(root.val);
            headOrder(root.left);
            headOrder(root.right);
        }
    }
    public static void midOrder(TreeNode root){
        if (root!=null){
            midOrder(root.left);
            mid.add(root.val);
            midOrder(root.right);
        }
    }
    public static void endOrder(TreeNode root){
        if (root!=null){
            endOrder(root.left);
            endOrder(root.right);
            end.add(root.val);
        }
    }
}