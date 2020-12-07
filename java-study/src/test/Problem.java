package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Problem {
    public static void main(String[] args) {
        int[][] A = new int[][]{{1,2},{4,5},{7,8,10,11,12},{}};
        System.out.println(A.length);
        System.out.println(A[0].length);
    }
    //反转链表
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur.next!=null){
            ListNode curNext = cur.next;
            cur.next = pre;
            pre = cur;
            cur = curNext;
        }
        return cur;
    }
    //给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
    //
    //你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
    /*public int[] twoSum(int[] nums, int target) {
    //暴力法
        for (int i = 0; i <nums.length ; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if (nums[j]==target-nums[i]){
                    return new int[]{i,j};
                }
            }
        }
        throw new  IllegalArgumentException("无结果");
    }*/
    /*public int[] twoSum(int[] nums,int target){
    //两边哈希表法
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            map.put(nums[i],i);
        }
        for (int i = 0; i <nums.length ; i++) {
            int cur = target-nums[i];
            if (map.containsKey(cur)&&map.get(cur)!=i){
                return new int[]{i,map.get(cur)};
            }
        }
        throw new IllegalArgumentException("无结果");
    }*/
    //给定一个二维网格和一个单词，找出该单词是否存在于网格中。
    //
    //单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。

    /*public static boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        if (m==0){
            return false;
        }
         boolean[][] judge = new boolean[m][n];
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                if (dfs(m,n,0,board, word,judge)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean dfs(int i, int j, int start, char[][] board, String word, boolean[][] judge){
        if (board[i][j]!=word.charAt(start)){
            return false;
        }
               else if (start==word.length()-1){
            return true;
        }
        judge[i][j]=true;
        int[][] move = {{-1,0},{0,-1},{0,1},{1,0}};
        if (board[i][j]==word.charAt(start)){

            for (int k = 0; k <4 ; k++) {
                int newX = i+ move[k][0];
                int newY = j+ move[k][1];
                if (inArea(newX,newY,board)&&!judge[newX][newY]){
                    if (dfs(newX,newY,start+1,board, word,judge)){
                        return true;
                    }
                }
            }
            judge[i][j]=false;
        }
        return false;
    }
    public static boolean inArea(int x, int y, char[][] board){
        return x>=0&&x<board.length&&y>=0&&y<board[0].length;
    }*/
    //字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。
    // 比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
    public String reverseLeftWords(String s, int n) {
        //方法一
        /*String str1 = s.substring(n);
        String str2 = s.substring(0,n-1);
        String str3 = str1+str2;
        return str3;*/
        //方法二
        StringBuilder sb = new StringBuilder();
        for (int i = n; i <n+s.length() ; i++) {
            sb.append(s.charAt(i%s.length()));
        }
        return sb.toString();
    }
    //输入一棵二叉树的根节点，求该树的深度。从根节点到叶节点依次经过的节点（含根、叶节点）形成树的一条路径，
    // 最长路径的长度为树的深度。
    public static int maxDepth(TreeNode root) {
        if (root==null){
            return 0;
        }
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
    //在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。
    public char firstUniqChar(String s) {
        HashMap<Character,Boolean> map = new HashMap<>();
        char[] arr = s.toCharArray();
        for (char x: arr ) {
            map.put(x,!map.containsKey(x));
        }
        for (char y: arr ) {
            if (map.get(y)){
                return y;
            }
        }
        return ' ';
    }
    //链表的倒数第K个节点
    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head==null){
            return null;
        }
        ListNode first = head;
        ListNode second = head;
        int x = k;
        while (x>0){
            first = first.next;
        }
        while (first!=null){
            first = first.next;
            second = second.next;
        }
        return second;
    }
    //斐波那锲三角形
    //输入一个数，输出对应的斐波那锲三角形
    //1
    //111
    //11211
    //1123211
    public static void fbTriangle(int x){
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <=x ; i++) {
            sb.append(fib(i));
        }
        for (int i = x-1; i >0 ; i--) {
            sb.append(fib(i));
        }
        System.out.println(sb.toString());
    }
    public static int fib(int x){
        if (x==1||x==2){
            return 1;
        }
        return fib(x-1)+fib(x-2);
    }
    //输入一棵二叉树的根节点，判断该树是不是平衡二叉树。
    // 如果某二叉树中任意节点的左右子树的深度相差不超过1，那么它就是一棵平衡二叉树。
    public boolean isBalanced(TreeNode root) {
        if (root==null){
            return false;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.abs(left-right)<=1&&isBalanced(root.left)&&isBalanced(root.right);
    }
    //输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
    public int[] reversePrint(ListNode head) {
        /*//两边遍历
        ListNode cur = head;
       int length = 0;
        while (cur!=null){
            length++;
            cur = cur.next;
        }
        int[] arr = new int[length];
        ListNode cur2 = head;
        for (int i = length-1; i >=0 ; i--) {
            arr[i] = cur2.val;
            cur2 = cur2.next;
        }
        return arr;*/
        //借助栈
        Stack<ListNode> stack = new Stack<>();
        ListNode cur = head;
        while (cur!=null){
            stack.push(cur);
            cur = cur.next;
        }
        int[] arr = new int[stack.size()];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = stack.pop().val;
        }
        return arr;
    }
    //定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
    public ListNode reverseList1(ListNode head) {
        if (head==null){
            return null;
        }
        ListNode cur = head;
        ListNode per = null;

        while (cur!=null){
            ListNode curNext = cur.next;
            cur.next=per;
            per = cur;
            cur = curNext;
        }
        return per;
    }
    //给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
    //
    //返回删除后的链表的头节点。
    public ListNode deleteNode(ListNode head, int val) {
        if (head==null){
            return null;
        }
        if (head.val==val){
            return head.next;
        }
        ListNode cur = head;
        ListNode pre = null;
        while (cur.next!=null){
            if (cur.val==val){
                pre.next = cur.next;
            }
            pre = cur;
            cur = cur.next;
        }
        if (cur.val==val){
            pre.next=null;
        }
        return head;
    }
    //输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null){
            return l2;
        }
        if (l2==null){
            return l1;
        }
        ListNode l1cur = l1;
        ListNode l2cur = l2;
        ListNode newHead = new ListNode(0);
        ListNode cur = newHead;
       while (cur!=null&&l1cur!=null&&l2cur!=null){
           if (l1cur.val<=l2cur.val){
               cur.next = l1cur.next;
               cur = cur.next;
               l1cur = l1cur.next;
           }else{
               cur.next = l2cur.next;
               cur = cur.next;
               l2cur = l2cur.next;
           }
       }
       if (l1cur==null){
           cur.next=l2cur;
       }
       if (l2cur==null){
           cur.next=l1cur;
       }
       return newHead.next;
    }
    //请实现 copyRandomList 函数，复制一个复杂链表。在复杂链表中，
    // 每个节点除了有一个 next 指针指向下一个节点，还有一个 random 指针指向链表中的任意节点或者 null。
    //

    public Node copyRandomList(Node head) {
        //Hasmap表法
        Node cur = head;
        Node newList = new Node(0);
        Node cur2 = newList;
        HashMap<Node, Node> map = new HashMap<>();
        while (cur != null) {
            Node node = new Node(cur.val);
            cur2.next = node;
            map.put(cur, node);
            cur = cur.next;
            cur2 = cur2.next;
        }
        Node cur3 = head;
        while (cur3 != null) {
            map.get(cur3).random = map.get(cur3.random);
        }
        return newList.next;
    }

}
