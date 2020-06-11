import java.util.*;

public class Main2 {
    //一个整形数组里，除了两个数字之外，其他数字都出现了两次，求这两个只出现一次的数字
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int retExclusive = 0;
            for (int i = 0; i <n ; i++) {
                retExclusive^=arr[i];
            }
            int index = findIndex(retExclusive);
            int num1 = 0;
            int num2 = 0;
            for (int i = 0; i <n ; i++) {
                if (judgeIndex(arr[i],index)){
                    num1^=arr[i];
                }else{
                    num2^=arr[i];
                }
            }
            if (num1<num2){
                System.out.println(num1+" "+num2);
            }else{
                System.out.println(num2+ " " + num1);
            }
        }
        }
        public static int findIndex(int num){
        //在整数num中找到最右边是1的位置
        int index = 0;
        while ((num&1)==0){
            num>>=1;
            index++;
        }
        return index;
        }
        public static boolean judgeIndex(int num,int index){
        //判断整数num右边第num位是否为1
        num>>=index;
        return ((num&1)==1);
        }
}
