import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        /*int x = 20;
        int y = 5;
        System.out.println(x+y+"" +(x+y)+y);
        mystery(1234);*/
        /*int[] array = {1,2,3,4,5};
        rotate(array,2);
        System.out.println(Arrays.toString(array));*/
        /*int[] array = {1,3,4,5,6};
        int n = searchInsert(array,2);*/
        String s = "a ";
        int x = lengthOfLastWord(s);
        System.out.println(x);
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
    //给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
    //你可以假设数组中无重复元素。
    public static int searchInsert(int[] nums, int target) {
        int left = 0,right = nums.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if (nums[mid]==target){
                return mid;
            }else if (nums[mid]<target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return left;
    }
    //给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，
    // 判断第一个字符串ransom能不能由第二个字符串magazines里面的字符构成。
    // 如果可以构成，返回 true ；否则返回 false
    public boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.length()<ransomNote.length()){
            return false;
        }
        StringBuilder sb = new StringBuilder(magazine);
        for (int i = 0; i <ransomNote.length() ; i++) {
            if (!sb.substring(0).contains(ransomNote.charAt(i)+"")){
                return false;
            }else{
                sb.deleteCharAt(sb.indexOf(ransomNote.charAt(i)+""));
            }
        }
        return true;
    }
    //判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
    public boolean isPalindrome(int x) {
        String str = (new StringBuilder(x)).reverse().toString();
        return (new String(x+"")).equals(str);
    }
    //给定一个仅包含大小写字母和空格 ' ' 的字符串 s，返回其最后一个单词的长度
    public static int lengthOfLastWord(String s) {
        int length = 0;
        for (int i = s.length()-1; i >=0 ; i--) {
            if (s.charAt(i)!=' '){
                length++;
            }
            if (s.charAt(i)==' '&&length!=0){
                break;
            }
        }
        return length;
    }
}
