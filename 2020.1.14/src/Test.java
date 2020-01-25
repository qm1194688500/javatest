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
        /*String s = "a ";
        int x = lengthOfLastWord(s);
        System.out.println(x);*/
        int[] sum1 = {1,2,3,0,0,0};
        int[] sum2 = {4,5,6};
        merge(sum1,3,sum2,3);
        for (int x:sum1
             ) {
            System.out.println(x);
        }
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
    //给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m + n - 1;
        int i = m - 1;
        int j = n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] <= nums2[j]) {
                nums1[k] = nums2[j];
                j--;
                k--;
            } else {
                nums1[k] = nums1[i];
                i--;
                k--;
            }
        }
        for (int t = 0; t < j + 1; t++) {
            nums1[t] = nums2[t];
        }
    }
    //给定一个整数数组，判断是否存在重复元素。
    //
    //如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i <nums.length-1 ; i++) {
            if (nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
    //你的朋友正在使用键盘输入他的名字 name。偶尔，在键入字符 c 时，按键可能会被长按，而字符可能被输入 1 次或多次。
    //你将会检查键盘输入的字符 typed。如果它对应的可能是你的朋友的名字（其中一些字符可能被长按），那么就返回 True。
    public boolean isLongPressedName(String name, String typed) {
        int len_n = name.length();
        int len_t = typed.length();
        if (len_t<len_n){
            return false;
        }
        int i = 0;
        int j = 0;
        while (i<len_n&&j<len_t){
            if (name.charAt(i)==typed.charAt(j)){
                i++;
                j++;
            }else if (j>0&&typed.charAt(j)==typed.charAt(j-1)){
                j++;
            }else{
                return false;
            }
        }
        return true;
    }
    //给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
    public int[] sortedSquares(int[] A) {
        for (int i = 0; i <A.length ; i++) {
            A[i] = A[i]*A[i];
        }
        Arrays.sort(A);
        return A;
    }
    //给定一个字符串 S，返回 “反转后的” 字符串，其中不是字母的字符都保留在原地，而所有字母的位置发生反转。
    public String reverseOnlyLetters(String S) {
        int len = S.length();
        char[] temp = new char[len];
        for (int i = 0; i <len ; i++) {
            if (Character.isLowerCase(S.charAt(i))){
                temp[]
            }
        }
    }
}
