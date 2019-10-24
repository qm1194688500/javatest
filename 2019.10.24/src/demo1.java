import java.util.Arrays;
public class demo1 {
    public static void main(String[] args) {
       /* int[] arr = {1,2,3,4,5};
        System.out.println(sequence(arr));
       ----------------------------
       int[] arr = {1,5,8,4,6,3,1,4};
       bobbleSort(arr);
        System.out.println(Arrays.toString(arr));
       ---------------------------------
       int[] arr = {1,2,3,4,5,6,7,8,9,10};
       reverse(arr);
        System.out.println(Arrays.toString(arr));
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        transform(arr);
        System.out.println(Arrays.toString(arr));*/
    }
    public static boolean sequence(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void bobbleSort(int[] arr) {
        int k = arr.length-1;
        for (int i = 0; i < arr.length - 1; i++) {//循环趟数
            int flg = 0;//标记一趟下来是否发生交换
            int pos = 0;//定位标记，查看上次最后一次发生交换位置
            for (int j = 0; j < k; j++) {//交换次数
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flg = 1;
                    pos = j;//最后一次发生交换位置
                }
            }
            if (flg==0){
                return;//若没发生交换，则已排好序
            }
            k = pos;//赋给内循环
        }
    }
    public static void reverse(int[] arr){
        //数组元素逆序
        int a = 0 ;
        int b = arr.length-1;
        for (int i = 0; i <arr.length/2 ; i++) {
            int temp = arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
            a++;
            b--;
        }
    }
    public static void transform(int[] arr) {
        //数组数字排列
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
// 该循环结束, left 就指向了一个奇数
            while (left < right && arr[left] % 2 == 0) {
                left++;
            }
// 该循环结束, right 就指向了一个偶数
            while (left < right && arr[right] % 2 != 0) {
                right--;
            }
// 交换两个位置的元素
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
        }
    }
}
