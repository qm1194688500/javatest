import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

    }
    public int[] plusOne(int[] digits) {
        //给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
        //
        //最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
        //
        //你可以假设除了整数 0 之外，这个整数不会以零开头。
        //
        for (int i = digits.length-1; i >=0 ; i--) {
            if (digits[i]!=9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] tmp = new int[digits.length+1];
        tmp[0] = 1;
        return tmp;
    }
    private long MIN = Long.MIN_VALUE;    // MIN代表没有在值

    public int thirdMax(int[] nums) {
        if (nums == null || nums.length == 0) throw new RuntimeException("nums is null or length of 0");
        int n = nums.length;

        int one = nums[0];
        long two = MIN;
        long three = MIN;

        for (int i = 1; i <  n; i++) {
            int now = nums[i];
            if (now == one || now == two || now == three) continue;    // 如果存在过就跳过不看
            if (now > one) {
                three = two;
                two = one;
                one = now;
            } else if (now > two) {
                three = two;
                two = now;
            } else if (now > three) {
                three = now;
            }
        }

        if (three == MIN) return one;  // 没有第三大的元素，就返回最大值
        return (int)three;
    }
    public String addBinary(String a, String b) {
        //给你两个二进制字符串，返回它们的和（用二进制表示）。
        //
        //输入为 非空 字符串且只包含数字 1 和 0。
        StringBuilder ans = new StringBuilder();
        int ca = 0;
        for(int i = a.length() - 1, j = b.length() - 1;i >= 0 || j >= 0; i--, j--) {
            int sum = ca;
            sum += i >= 0 ? a.charAt(i) - '0' : 0;
            sum += j >= 0 ? b.charAt(j) - '0' : 0;
            ans.append(sum % 2);
            ca = sum / 2;
        }
        ans.append(ca == 1 ? ca : "");
        return ans.reverse().toString();
    }
}
