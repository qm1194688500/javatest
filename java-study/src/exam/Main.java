package exam;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    /*统计回文
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int ret = 0;

        for (int i = 0; i <=str1.length() ; i++) {
            StringBuilder A = new StringBuilder(str1);
            String sb = A.insert(i,str2).toString();
            System.out.println(sb);
            if (judge(sb)){
                ret++;
            }
        }
        System.out.println(ret);
    }
    public static boolean judge(String str){
        int cur1 = 0;
        int cur2 = str.length()-1;
        while (cur1<cur2){
            if (str.charAt(cur1)!=str.charAt(cur2)){
                return false;
            }else{
                cur1++;
                cur2--;
            }
        }
        return true;
    }*/
    /*汽水瓶
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while (x!=0){
            System.out.println(method(x));
            x = sc.nextInt();
        }
    }
    public static int method(int x){
        if (x<=1){
            return 0;
        }
        if (x==2||x==3){
            return 1;
        }
        return method(x-3+1)+1;
    }*/
    //合法括号序列判断
    /*public static boolean chkParenthesis(String A, int n) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i <n ; i++) {
            if (A.charAt(i)=='('){
                stack.push(A.charAt(i));
            }
            if (A.charAt(i)==')'){
                if (!stack.empty()){
                    stack.pop();
                }else {
                    return false;
                }
            }
            if (A.charAt(i)!='('&&A.charAt(i)!=')'){
                return false;
            }
        }
        return stack.empty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        System.out.println(chkParenthesis(str,n));
    }*/
    //字符串中找出连续最长数字串
    /*public static String method(String str){
        int max = 0;
        int count = 0;
        int cur = 0;
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)>='0'&&str.charAt(i)<='9'){
               count++;
               if (count>max){
                   max = count;
                   cur = i;
               }
            }else{
                count=0;
            }
        }
        return str.substring(cur-max+1,cur+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(method(str));
    }*/
    //删除公共字符
    /*public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(method(str1,str2));
    }
    public static String method(String str1,String str2){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i <str1.length() ; i++) {
            if (!str2.contains(str1.charAt(i)+"")){
                sb.append(str1.charAt(i));
            }
        }
        return sb.toString();
    }*/
    //买苹果
    /*public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(method(n));
    }
    public static int method(int n){
        if (n%2==1){
            return -1;
        }
        int a = n/8;
        for (int i = a; i >0 ; i--) {
            int x = n-i*8;
            if (x%6==0){
                return i+x/6;
            }
        }
        return -1;
    }*/
    //用两个栈实现一个队列
   /* Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
       while (!stack1.empty()){
           stack2.push(stack1.pop());
       }
       int ret = stack2.pop();
       while (!stack2.empty()){
           stack1.push(stack2.pop());
       }
       return ret;
    }*/
    //一组数中出现次数超过一半的数字
   /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        String[] arr = str.split(" ");
        int[] ret = new int[arr.length];
        for (int i = 0; i <ret.length ; i++) {
            ret[i] = Integer.valueOf(arr[i]);
        }
        Arrays.sort(ret);
        System.out.println(ret[ret.length/2-1]);
    }*/
    //n个数里前k大的数
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        int[] ret = new int[arr.length-1];
        int k = Integer.valueOf(arr[arr.length-1]);
        for (int i = 0; i < ret.length; i++) {
            ret[i] = Integer.valueOf(arr[i]);
        }
        Arrays.sort(ret);
        for (int i = 0; i <k ; i++) {
            System.out.print(ret[i]+" ");
        }
    }*/
    //求n的阶乘里零的个数
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ret = 0;
        for (int i = 1; i <=n ; i++) {
            int temp = i;
            while(temp%5==0){
                ret++;
                temp/=5;
            }
        }
        System.out.println(ret);
    }*/
    //斐波那切数列
    /*public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
        int i = 1;
        while (x>Fib(i)){
            i++;
        }
        int a = Math.abs(x-Fib(i));
        int b = Math.abs(x-Fib(i-1));
        System.out.println(Math.min(a,b));
    }
    public static int Fib(int n){
        if (n==1){
            return 0;
        }
        if (n==2||n==3){
            return 1;
        }
        return Fib(n-1)+Fib(n-2);
    }*/
    //走方格
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(countWays(x,y));
    }
    public static int countWays(int x, int y) {
        if (x==1){
            return 1;
        }
        if (y==1){
            return 1;
        }
        return countWays(x-1,y)+countWays(x,y-1);
    }*/
    //生成格雷码
   /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Arrays.toString(getGray(n)));
    }
    public static String[] getGray(int n) {
        if (n==1){
            String[] ret = new String[2];
            ret[0] = "0";
            ret[1] = "1";
            return ret;
        }else{
            String[] cur = getGray(n-1);
            String[] ret = new String[cur.length*2];
            for (int i = 0; i <cur.length ; i++) {
                ret[i] = "0"+cur[i];
            }
            int j = 0;
            for (int i = cur.length-1; i >=0 ; i--) {

                ret[i+cur.length] = "1"+cur[j++];
            }
            return ret;
        }
    }*/
    //个位数统计
   /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n= sc.nextLine();
        int[] arr = new int[10];
        for (int i = 0; i < n.length(); i++) {
            arr[n.charAt(i)-'0']++;
        }
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>0){
                System.out.println(i+":"+arr[i]);
            }
        }
    }*/
    //跟奥巴马一起学编程
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        for (int i =1 ; i <=n/2; i++) {
            for (int j = 1; j <=n ; j++) {
                if (i==1||i==n/2){
                    System.out.print(str);
                }else{
                    if (j==1||j==n){
                        System.out.print(str);
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }*/

    //超长正整数相加
     /*public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            System.out.println(AddLongInteger(str1,str2));
       }
    public static String AddLongInteger(String addend,String augend){
       StringBuilder sb = new StringBuilder();
       int carry = 0;
       int i = addend.length()-1;
       int j = augend.length()-1;
       while (i>=0||j>=0||carry!=0){
           int sum = 0;
           if (i>=0){
               sum+=addend.charAt(i--)-'0';
           }
           if (j>=0){
               sum+=augend.charAt(j--)-'0';
           }
           sum+=carry;
           sb.append(sum%10);
           carry = sum/10;
       }
       return sb.reverse().toString();
    }*/
    //组个最小数
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = sc.nextInt();
        }

        StringBuilder sb = new StringBuilder();
        for (int j = 1; j <arr.length ; j++) {
            int time = arr[j];
            while (time>0){
                sb.append(j);
                time--;
            }
        }
       if (arr[0]>0){
            int cur = arr[0];
            while (cur>0){
               sb.insert(1,0);
                cur--;
            }
       }
        System.out.println(sb.toString());
    }*/
    //尼科彻斯定理
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int ret = n * n * n;
            int a1 = (ret - n * (n - 1)) / n;
            String str = "";
            for (int i = 0; i < n - 1; i++) {
                str += a1 + "+";
                a1 = a1 + 2;
            }
            str += a1;
            System.out.println(str);
        }
    }*/
    //饥饿的小易
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n!=0&&count<=300000){
            n=((n<<1)+1)%1000000007;
            count++;
        }
        int ret = (count+2)/3;
        if (ret>100000){
            System.out.println("-1");
        }else{
            System.out.println(ret);
        }
    }*/
    //统计某个分数的学生人数
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i <n ; i++) {
                arr[i] = sc.nextInt();
            }
            int cur = sc.nextInt();
            int count = 0;
            for (int i = 0; i <arr.length ; i++) {
                if (arr[i]==cur){
                    count++;
                }
            }
            System.out.println(count);
        }
    }*/
    //DNA序列
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int x = sc.nextInt();
        System.out.println(method(str,x));
    }

    public static String method(String s, int x){
        String Max = "";
        int max = 0;
        for (int i = 0; i <=s.length()-x ; i++) {
            String str = s.substring(i,i+x);
            int j = 0;
            int cont = 0;
            while (j<str.length()){
                if (str.charAt(j)=='G'||str.charAt(j)=='C'){
                    cont++;
                }
                j++;
            }
            if (cont>max){
                max = cont;
                Max = str;
            }
        }
        return Max;
    }*/
}
