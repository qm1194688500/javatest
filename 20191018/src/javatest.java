import java.util.Scanner;
public class javatest {
    public static void main(String[] args) {
        /*int a = 10;
        int b = 20;
        int ret = add(a,b);
        System.out.println("ret = "+ ret);
        -----------------------
        int count = 0;
        for(int i=1;i<=5;i++){
            count += factor(i);
        }
        System.out.println(count);
        ---------------------------
        int x= 20;
        int y= 30;
        int ret1 = add(x,y);
        System.out.println("ret1 = " + ret1);
        double x2 = 20.5;
        double y2 = 10.5;
        double ret2 = add(x,y);
        System.out.println("ret2 = " + ret2);
        double x3 = 1.5;
        double y3 = 2.5;
        double z3 = 3.5;
        double ret3 = add(x3,y3,z3);
        System.out.println("ret3 = " + ret3);
        -----------------------------
        int n = 5;
        int ret = method(n);
        System.out.println("ret = " + ret);
       int ret = ad(10);
        System.out.println("ret = " + ret);
        -----------比较两个数大小--------
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个整数");
        int x = sc.nextInt();
        System.out.println("输入第二个整数");
        int y = sc.nextInt();
        int max = cap(x,y);
        System.out.println("max = " + max);
        ------------比较两数是否相等---------
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个整数");
        int x = sc.nextInt();
        System.out.println("输入第二个整数");
        int y = sc.nextInt();
        boolean res = equ(x,y);
        if(res == true){
            System.out.println("两数相等");
        }else{
            System.out.println("两数不相等");
        }
        --------输出几行几列的*号----------
        Scanner sc = new Scanner(System.in);
        System.out.println("输入行数");
        int x = sc.nextInt();
        System.out.println("输入列数");
        int y = sc.nextInt();
     print(x,y);
     -----------输入非负整数，返回组成它的数字之和----------
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = sum(n);
        System.out.println("sum = " + res);
        ---------斐波那切数列------------
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = fib(n);
        System.out.println("num = " + num);*/
    }
    public static int add(int x, int y){
        return x + y;
    }
    public static int factor(int n){
        int result = 1;
        for(int i = 1;i<=n;i++){
            result *=i;
        }
        return result;
    }
    public static double add(double x,double y){
        return x + y;
    }
    public static double add(double x,double y,double z){
        return x + y +z;
    }
    public static int method(int n){
        if (n == 1){
            return 1;
        }
        return n*method(n-1);
    }
    public static int ad(int num){
        if(num==1){
            return 1;
        }
        return num + ad(num-1);
    }
    public static int cap(int x,int y){
        return x > y ? x : y;
    }
    public static boolean equ(int x,int y){
        return x==y ;
    }
    public static void print(int x,int y){
        for(int i = 1;i <= x;i++ ){
            for(int j = 1;j <= y;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static int sum(int num){
        if (num < 10){
            return num;
        }
        return num % 10 + sum(num / 10);
    }
    public static int fib(int n ){
        if(n == 1 || n == 2){
            return 1;
        }
        return fib(n-1) + fib( n-2);
    }
}
