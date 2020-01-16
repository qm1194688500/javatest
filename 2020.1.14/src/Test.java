import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        /*int x = 20;
        int y = 5;
        System.out.println(x+y+"" +(x+y)+y);
        mystery(1234);*/
        int[] array = {1,2,3,4,5};
        rotate(array,2);
        System.out.println(Arrays.toString(array));
    }
    public static void mystery (int x) {
        System.out.print(x % 10);
        if ((x / 10) != 0){
            mystery(x / 10);
        }
        System.out.print(x % 10);
    }
    public  static String toLowerCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]<='Z' && chars[i]>='A'){
                chars[i] = (char) ((byte)chars[i] + 32);
            }
        }
        return String.valueOf(chars);
    }
    //给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        for (int i = 0; i <k ; i++) {
            int temp = nums[n-1];
            for (int j = n-1; j >0 ; j--) {
                nums[j] = nums[j-1];
            }
            nums[0] = temp;
        }
    }
    //给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j <nums.length ; j++) {
            if (nums[j]!=val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
