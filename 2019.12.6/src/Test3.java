import java.util.Arrays;

public class Test3 {

    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5};
        int x = 6;
        int[] ret = twoSum(arr,6);
        System.out.println(Arrays.toString(ret));
    }
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for (int j = i+1; j <nums.length ; j++) {
                if (nums[i] == target-nums[j]){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("没有合适的值");
    }
}
